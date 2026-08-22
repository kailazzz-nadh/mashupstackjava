package day12cw;
import java.io.FileWriter;
import java.io.FileReader;

public class filewriter {

	public static void main(String[] args) {

		String data="Java File Handling Practice";
		try {
			
		
		FileWriter Write=new FileWriter("assignment.txt");
		
		 Write.write(data);
		 
	       System.out.println("Data is written to the file.");
	 
			
Write.close();
FileReader input = new FileReader("assignment.txt");

char[] array = new char[100];
 input.read(array);

System.out.println("Data in the file:");
System.out.println(array);


input.close();
	       
	      
	     }
		 catch (Exception e) {
		       e.getStackTrace();
		     }
		

	}

}

