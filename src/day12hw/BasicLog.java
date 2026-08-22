package day12hw;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class BasicLog {

	public static void main(String[] args) {
		File input=new File("log.txt");
		String data="Book order placed at [your preferred time]";
		char[] array=new char[100];
		
		try {
			boolean value=input.createNewFile();
		
			if(value) {
				System.out.println("New file created");
			}
			else {
					System.out.println("File alraedy exists");
				}
			FileWriter write=new FileWriter("log.txt");
			write.write(data);
			System.out.println("Data is written to the file.");
			write.close();
			FileReader out=new FileReader("log.txt");
			out.read(array);
			System.out.println(array);
			out.close();
		}
		
				catch(Exception e) {
					 e.getStackTrace();
				}
			}
			
		}

	


