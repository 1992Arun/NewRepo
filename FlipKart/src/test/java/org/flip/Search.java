package org.flip;

import java.awt.AWTException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Search extends BaseClass{
	
	@BeforeClass
	public static void beforeClass() {
		
		
	}
	
	@Before
	public void before() {
		
	}
	
	@Test
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		image();
		
	}
	public static void image() throws AWTException, InterruptedException {
		
		
		browser("Chrome");
		
		getURL("https://www.google.com/");
		
		POMClass p = new POMClass();
		
		jsendKeys(p.getSearch(), "sukshma darshini");
		
		jClick(p.getSearchbutton().get(1));
		
		jClick(p.getImgbutton());
				
		rightClick(p.getImages().get(0));
		
		clickSaveImage(7);
		
				
	}

	
	@After
	public void after() {
		
	}
	
	@AfterClass
	public static void afterClass() {
		
		
	}

}
