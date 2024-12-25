package org.test;


import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parameters extends POMClass{

	@BeforeClass
	public static void beforeClass() {



	}



	@BeforeMethod
	public void beforeMethod() {


	}


	@Test(dataProvider ="location")
	public void  test(String location, String hotel, String type) throws InterruptedException, IOException {

		SoftAssert s = new SoftAssert();

		browser("Chrome");

		//Login

		POMClass p = new POMClass();

		getURL("https://adactinhotelapp.com/");

		s.assertEquals(getCurrectURL(), "https://adactinhotelapp.com/");

		jsendKeys(p.getUsername(), "1992Arun");

		s.assertEquals(getAttribute(p.getUsername()), "1992Arun");

		jsendKeys(p.getPassword(), "9862762829");

		s.assertEquals(getAttribute(p.getPassword()), "9862762829");

		jClick(p.getLogin());
		
		System.out.println(timeStamp());

	

		s.assertTrue(getCurrectURL().contains("SearchHotel.php"));

		//SearchRoom

		selectByText(p.getLocation(), location);


		s.assertEquals(getAttribute(p.getLocation()), location, "Location incorrect:");

		selectByText(p.getHotels(), hotel);

		s.assertEquals(getAttribute(p.getHotels()), hotel, "Hotel Namme incorrect:");

		selectByText(p.getRoomType(), type);

		s.assertEquals(getAttribute(p.getRoomType()), type, "Hotel type incorrect:");




		selectByIndex(p.getRoomNos(), 1);

		s.assertEquals(getAttribute(p.getRoomNos()), "1", "Invalid number selected");

		jsendKeys(p.getCheckIN(),"31/12/2024");

		s.assertEquals(getAttribute(p.getCheckIN()), "31/12/2024", "Invalid date Given");

		jsendKeys(p.getCheckOut(),"01/01/2025");

		s.assertEquals(getAttribute(p.getCheckOut()), "01/01/2025", "Invalid date Given");

		selectByIndex(p.getAdultRoom(), 2);

		s.assertEquals(getAttribute(p.getAdultRoom()), "2", "Invalid number selected");

		selectByIndex(p.getChildtRoom(), 0);

		s.assertEquals(getAttribute(p.getChildtRoom()), "0", "Invalid number selected");

		jClick(p.getSearchRoom());

		s.assertTrue(getCurrectURL().contains("SelectHotel.php"),"Search button not cliked");
	
        takeScreenshot();

		  quit();






	}	


	@DataProvider(name="location")	
	@Test
	private String[][] test2()
	{

		String[][] obj = { {"Sydney","Hotel Sunshine","Standard"},  {"Los Angeles","Hotel Hervey","Double"},{"London", "Hotel Cornice","Deluxe"} };

		return obj;

	}    


	@Test(enabled=false)
	private void payment() throws InterruptedException {

		POMClass p = new POMClass();

		SoftAssert s = new SoftAssert();

		jClick(p.getRadioButoon());

		s.assertTrue(p.getRadioButoon().isSelected(), "Search button not selected");

		jClick(p.getContinueButton());

		s.assertTrue(getCurrectURL().contains("BookHotel.php"), "Continue button not cliked");

		jsendKeys(p.getFirst_name(), "Arun" );

		s.assertEquals(getAttribute(p.getFirst_name()), "Arun", "Invalid first name");

		jsendKeys(p.getLast_name(), "Arun");

		s.assertEquals(getAttribute(p.getLast_name()), "Arun", "Invalid last name");

		jsendKeys(p.getAddress(), "Chennai" );

		s.assertEquals(getAttribute(p.getAddress()), "Chennai", "Invalid address given");

		jsendKeys(p.getCcNumber(), "9876762367326745");

		s.assertEquals(getAttribute(p.getCcNumber()), "9876762367326745",  "Invalid cardnumber given");

		selectByText(p.getCc_type(), "American Express");

		s.assertEquals( getSelectbyText(p.getCc_type()), "American Express",  "Invalid CardType given");

		selectByIndex(p.getCc_exp_month(), 8);

		s.assertEquals( getSelectbyText(p.getCc_exp_month()), "August",  "Invalid month selected");

		selectByText(p.getCc_exp_year(), "2029");

		s.assertEquals(getAttribute(p.getCc_exp_year()), "2029", "Invalid year selected");

		jsendKeys(p.getCc_cvv(), "928");

		s.assertEquals(getAttribute(p.getCc_cvv()), "928", "Invalid Cvv given");

		click(p.getBook_now());

		sleep(5);

		s.assertTrue(getCurrectURL().contains("BookingConfirm.php"), "Booking not confirmed");

		printText(p.getOrder_no());

		s.assertEquals(webStringlength(p.getOrder_no()), 10, "Order number not generated ");

	
	
	}
	
	


	@AfterClass
	public void afterClass() {


		

	}



	@AfterMethod
	public void after() {


	}


}
