package org.files;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Files {
	
	public static void main(String[] args) throws IOException {
	
	File f = new File("F:\\Arun");
	
	
	f.mkdir();
	
	
	File f1 = new File("F:\\Arun\\NewFile.doc");

	FileUtils.write(f1, "This is new file\n");
	
	FileUtils.write(f1, "This is seconda line\t", true);
	
	   List<String> rl = FileUtils.readLines(f1);
	  
	  for(String x:rl) {
		  
		  System.out.println(x);
		  
		  
	  }
	  
	  File f2 = new File("F:\\NewFile2.doc");
	
	  FileUtils.copyFile(f1, f2);
	  
	}
}
