package org.sample.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class SampleFile {

	
	public static void main (String[] args) throws IOException {
		
		
	
	File f= new File("F:\\Arun.txt");
	
	
	FileUtils.write(f, "My name is Arun\t", true);
	FileUtils.write(f, "My name is Arun\n", true);
	FileUtils.write(f, "My name is Java\n", true);
	FileUtils.write(f, "My name is Arun\n", true);
	FileUtils.write(f, "My name is Arun\n", true);
	FileUtils.write(f, "My name is Arun\n", true);
	FileUtils.write(f, "My name is Arun\n", true);
	FileUtils.write(f, "My name is Arun\n", true);
	FileUtils.write(f, "My name is Arun\n", true);
	FileUtils.write(f, "My name is Arun\n", true);
	
	List<String> rl = FileUtils.readLines(f);
	
	String ob= "Java";
	 
    System.out.println(rl.contains(ob));
	 
	 
	 

	 
	
	
	}

	
	
}
