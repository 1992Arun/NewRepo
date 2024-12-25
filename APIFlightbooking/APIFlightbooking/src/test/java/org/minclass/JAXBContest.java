package org.minclass;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBContest {
	
	public static void main(String[] args) throws JAXBException {
		
		booking();
	}
	
	public static void booking() throws JAXBException {
		
		 Unmarshaller un = JAXBContext.newInstance(Details.class).createUnmarshaller();
		 
		 File f = new File("C:\\Users\\Arun\\eclipse-workspace\\APIFlightbooking\\src\\test\\resources\\flightbooking.xml");
	
	      Object obj = un.unmarshal(f);
	      
	      Details  d =  (Details)obj;
	      
	       List<Detail> detail = d.getDetail();
	       
	       Detail first = detail.get(0);
	       
	       
	       System.out.println("Depature date: "+first.getDepature().getDepaturedate());
	       System.out.println("Depature from: "+first.getDepature().getDepaturefrom());
	       System.out.println("Returnd date:  "+first.getReturndate());
	       System.out.println("Traveller name: "+first.getTravellers());
	       System.out.println("Destination: "+first.getDestination());
	       
	     System.out.println("number of business class tickets: "+first.getClasses().getPremiume().getBusiness());
	       
	     System.out.println("number of First class tickets: "+first.getClasses().getPremiume().getFirstclass());
	       
	       
	       
	       
	       for(Detail de:detail) {
	    	   
	    	   System.out.println( );
	    	    System.out.println("Depature date: "+de.getDepature().getDepaturedate());
	       System.out.println("Depature from: "+de.getDepature().getDepaturefrom());
	       System.out.println("Returnd date:  "+de.getReturndate());
	       System.out.println("Traveller name: "+de.getTravellers());
	       System.out.println("Destination: "+de.getDestination());
	       
	     System.out.println("number of business class tickets: "+de.getClasses().getPremiume().getBusiness());
	       
	     System.out.println("number of First class tickets: "+de.getClasses().getPremiume().getFirstclass());
	       
	     System.out.println( );
       }
	    	  
	    	  
	      }
	
	
	
	
	}

