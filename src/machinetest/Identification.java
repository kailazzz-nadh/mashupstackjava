package machinetest;
import java.util.Scanner;
public class Identification {
	public void look(int id) {
		switch(id) {
		case 1:
			System.out.println("The name of student is Rajesh.");
			break;
		case 2:
			System.out.println("The name of student is Rahul.");
			break;
		case 3:
			System.out.println("The name of student is Sruthi.");
			break;
		default:
			System.out.println("ID not matching.");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the id of the student u want to find");
		int a=input.nextInt();
		input.nextLine();
		Identification find=new Identification();
		find.look(a);
		input.close();

	}

}
