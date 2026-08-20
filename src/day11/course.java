package day11;

public class course {
	String name;
	int duration;
	static int coursecount=0;
	final String TrainingCenter="MashupStack";
	course(){
		name="java fullstack";
		duration=6;
		coursecount++;
	}
course(String name,int duration){
	this.name=name;
	this.duration=duration;
	coursecount++;
}
public class CourseMaterial{
	public void out(){
		System.out.println("Material provided for this course");
	}
}
	public static void main(String[] args) {
		course c1=new course();
		course c2=new course("python",10);
		System.out.println("CourseName:"+c1.name+" "+"Duration:"+c1.duration);
		course.CourseMaterial material1=c1.new CourseMaterial();
		material1.out();
		System.out.println("CourseName:"+c2.name+" "+"Duration:"+c2.duration);
		course.CourseMaterial material2=c1.new CourseMaterial();
		material2.out();
		
		
		

	}

}
