package programiz;
import java.io.*;

import java.util.Scanner;
public class Filewriter {
	 public static void main(String[] args) {
	
		 Scanner input=new Scanner(System.in);
			System.out.println("Enter the path");
			String path=input.nextLine();
	
	
	
	
	
	try {
	File output=new File(path);
	if(output.exists()) {
		System.out.println("The file exists");		
	}


	Scanner ch=new Scanner(output);
	int count=0;
	int sentencecount=0;
	while(ch.hasNext()) {
		String word=ch.next();
		count++;
		if(word.endsWith(".")||word.endsWith("?")) {
			sentencecount++;
		}
		
	}
	
	System.out.println("Sentence count is"+" "+sentencecount);
	
	System.out.println("Word count is"+" "+count);
	ch.close();
	
	}
	catch (Exception e) {
	       e.getStackTrace();
	     }
}
}
