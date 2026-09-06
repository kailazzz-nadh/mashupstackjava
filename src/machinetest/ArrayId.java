package machinetest;
import java.util.Scanner;
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class ArrayId {
	

	public static void main(String[] args) {
	     Student[] student= {  new Student (1, "rajesh"),
	             new Student(2, "rahul"),
	             new Student(3, "sruthi")};
	     Scanner input=new Scanner(System.in);
	     System.out.println("Enter the student id");
	     int id=input.nextInt();
	     for(Student i:student){
	    	 if(i.id==id) {
	    		 System.out.println("Student name:"+" "+i.name);
	    		 break;
	    		
	    	 }
	    	 
	     }
input.close();
	}

}
