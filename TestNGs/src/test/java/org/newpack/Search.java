package org.newpack;

import java.awt.AWTException;

import org.data.DataProviders;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Search extends BaseClass{

	@BeforeClass
	public static void beforeClass() {


	}

	@BeforeMethod
	public void before() {

	}


	//@Parameters({"search"})
	
	@Test(dataProvider="login",dataProviderClass=DataProviders.class)
	
	public static void image(String search) throws AWTException, InterruptedException {

		SoftAssert s = new SoftAssert();


		browser("Chrome");

		
		String url = getURL("https://www.google.com/");

		boolean com = url.contains("google");

		Assert.assertTrue(com, "Verify URL"); 

		s.assertTrue(getCurrectURL().contains("google"), "verify URL");


		POMClass p = new POMClass();

		jsendKeys(p.getSearch(), search);



		//s.assertEquals(getAttribute(p.getSearch()), "sukshma darshini", "verify google text");

		jClick(p.getSearchbutton().get(1));



		boolean contains = getCurrectURL().contains("/search?sca_esv");


		s.assertTrue(getCurrectURL().contains("search?q"), "Search button not clicked");

		jClick(p.getImgbutton());

		s.assertTrue(getCurrectURL().contains("/search?sca_esv"), "Image button not clicked");

		rightClick(p.getImages().get(1));

		clickSaveImage(search);

		s.assertAll();		
	}

	
	
	
	@Test(enabled=false)
	private void test2(String search) {
		
		System.out.println(search);  
		
		


	}
	
	
	@DataProvider(name="login")
	public String[][] data() {
		
		String[][] obj = {
				
				{"Ajith"},{"Vidamuyarch"}};
			
	return obj;
			
	}
		
	@Test(enabled=false)	
	
	private void test1() {
		
		System.out.println("next text");
	}
		
	


	@AfterMethod
	public void after() {

	}

	@AfterClass
	public static void afterClass() {

		//	quit();

	}

}
