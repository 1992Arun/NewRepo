package org.filee;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class Filee {
	
	public static void main (String[] args) throws IOException {
	
	File f = new File("C:\\Users\\Arun\\eclipse-workspace\\FileHandling\\Sample");
	
	boolean mkdir = f.mkdir();
	
	System.out.println(mkdir);
	
	File f1 = new File("C:\\Users\\Arun\\eclipse-workspace\\FileHandling\\Sample\\Sample1\\Sample2");
	
	f1.mkdirs();
	

	File f2=new File("F:\\arun.txt");
	
	f2.createNewFile();
	
	f2.delete();
	
	File f3 =new File("F:\\arun1.txt");
	
	f3.createNewFile();
	
	f3.delete();
	
	String absoluteFile = f.getAbsolutePath();
	
	System.out.println(absoluteFile);
	
	System.out.println(f.getAbsolutePath());
	
	File f4=new File("C:\\Users\\Arun\\eclipse-workspace\\FileHandling");
	
	String[] li=f4.list();
	
	for(String x:li) {
		
		System.out.println(x);
		
	   }
		
	
		File[] lf=f4.listFiles();
		
		for(File x:lf) {
			
			System.out.println(x);
			
		}
			
		
			
			
			FileUtils.write(f3,  "Weclome to \t") ;
			FileUtils.write(f3, "Weclome to\n",true) ;
			FileUtils.write(f3, "Weclome to the word\n",true) ;
			
			FileUtils.copyFile(f3, f2);
			
			File f6 = new File("C:\\Users\\Arun\\eclipse-workspace\\FileHandling\\Sample\\Sample1\\Sample2\\Arun.txt");
			
		
			
			FileUtils.write(f6, "Hello");
			
		    java.util.List<String> rl = FileUtils.readLines(f3); 
			
			for(String x:rl) {
				
				System.out.println(x);
				
				
			}
			
			File f5= new File("F:\\arun2.txt");
			
			FileUtils.copyFile(f3, f5);
			
		 
			
			
			System.out.println(f5.getName());
			
			
		
			
		}
	
			
	
	
	
	}
	
	

