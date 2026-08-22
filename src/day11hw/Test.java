package day11hw;


public class Test {

	public static void main(String[] args) {
		Course c1=new Course("Java",6,3);
		Course c2=new Course("python",7,8);
		System.out.println("Course is:"+c1.name+" "+"duration:"+c1.duration+"students enrolled:"+c1.enrolled);
		Course.Platform platform1= new Course.Platform();
		platform1.out();
		
		System.out.println("Course is:"+c2.name+" "+"duration:"+c2.duration+"students enrolled:"+c2.enrolled);
		Course.Platform platform2= new Course.Platform();
		platform2.out();
		
		

	}

}
