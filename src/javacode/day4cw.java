package javacode;
import java.util.Scanner;

public class day4cw {

	public static void main(String[] args) {
		String UsrName="admin";
		String pass="java123";
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter ur name");
		String name=input.nextLine();
		System.out.println("Enter the password");
		String password=input.nextLine();
		if(name.equals(UsrName) && password.equals(pass)) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Access Denied");
		}
		

	}

}
