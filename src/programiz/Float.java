package programiz;
import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first number");
		float a=input.nextFloat();
		input.nextLine();
		System.out.println("Enter the second number");
		float b=input.nextFloat();
		input.nextLine();
		float product=a*b;
		System.out.println("The result is"+" "+product);
		
		

	}

}
