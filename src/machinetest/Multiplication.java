package machinetest;
import java.util.Scanner;

public class Multiplication {
	int a=0;
	public void  table(int n) {
	    for(int i=1;i<=10;i++) {
	    	a=n*i;
	    	System.out.println(i+" * "+n+" = "+a);
	    }
	   
	    
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int b=input.nextInt();
		Multiplication done=new Multiplication();
		done.table(b);
input.close();
	}

}
