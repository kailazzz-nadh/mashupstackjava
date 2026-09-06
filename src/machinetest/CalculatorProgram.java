package machinetest;
import java.util.Scanner;
class Calculator{
	int Addition(int a,int b) {
		return a+b;
	}
	int Subraction(int a,int b) {
		return a-b;
	}
	int Multiplication(int a,int b) {
		return a*b;
	}
	int Division(int a,int b) {
		if(b!=0) {
		return a/b;
		}
		else {
			System.out.println("invalid output");
			return 0;
		}
	}

}

public class CalculatorProgram {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=input.nextInt();
		System.out.println("Enter the second number");
		int b=input.nextInt();
		System.out.println("Enter ur choice");
		System.out.println("1. Addition");
		System.out.println("2. Subraction");
		System.out.println("3. Multiplictaion");
		System.out.println("4. Division");
		int choice=input.nextInt();
		switch(choice) {
		case 1:System.out.println(a+ "+" +b+" "+"="+cal.Addition(a,b));
		break;
		case 2:System.out.println(a+ "-" +b+" "+"="+cal.Subraction(a,b));
		break;
		case 3:System.out.println(a+ "*" +b+" "+"="+cal.Multiplication(a,b));
		break;
		case 4:
		if(b!=0) {
		System.out.println(a+ "/" +b+" "+"="+cal.Division(a,b));
		}
		else {
			System.out.println("Invalid Result");
		}
		
		break;
		default:System.out.println("Please enter a valid choice");
		
		
		
		
		}
		input.close();
		
		

	}

}
