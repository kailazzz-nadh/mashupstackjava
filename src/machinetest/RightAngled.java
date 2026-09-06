package machinetest;
import java.util.Scanner;

public class RightAngled {
	 public  void rightTriangle(int n) 
	    { 
	        int i, j;  
	        for(i=0; i<n; i++) 
	        { 
	          for(j=0; j<=i; j++) 
	            {       
	                System.out.print("*"); 
	            }           
	            System.out.println(); 
	        } 
	    } 

	public static void main(String[] args) {
	         RightAngled tri=new RightAngled();
	         Scanner input=new Scanner(System.in);
	         System.out.println("Enter the number");
	         int a=input.nextInt();
	         input.nextLine();
	         tri.rightTriangle(a);
	         input.close();

	}


}
