package profile;
import java.util.Scanner;
public class userinput {

	public String inputone(){
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter ur name");
		String name=input.nextLine();
		return name;

	}

}
