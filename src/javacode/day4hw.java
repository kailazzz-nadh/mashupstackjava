package javacode;
import java.util.Scanner;

public class day4hw {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your username code");
		String name=input.nextLine();
		System.out.println("Enter your password");
		int pass=input.nextInt();
		System.out.println("Enter your roleid");
		int roleid=input.nextInt();
		if(name.equals("A")&&pass==1234&&roleid==1) {
			System.out.println( "Welcome Admin. Full access granted.");
		}
		else if(name.equals("S")&&pass==1111&&roleid==2) {
			System.out.println( "Welcome Student. Limited access granted.");
			
		}
		else if(roleid==3) {
			System.out.println( "Welcome Guest. View-only access." );
		}
		else {
			System.out.println("Invalid credentials or role.");
		}
		
		
		input.close();
		

	}

}
