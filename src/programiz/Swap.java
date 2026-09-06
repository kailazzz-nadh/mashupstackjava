package programiz;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number for swapping");
		int a=input.nextInt();
		System.out.println("First number before swapping is"+" "+a);
		System.out.println("Enter the second number for swapping");
		int b=input.nextInt();
		System.out.println("Second number before swapping is"+" "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("First number after swapping is"+" "+a);
		System.out.println("Second number after swapping is"+" "+b);
		
		
		
		
		

	}

}
