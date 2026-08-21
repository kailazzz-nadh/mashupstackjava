package day11hw;

public class Course {
	String name;
	int duration;
	int enrolled;
	final String creator="CodeMentor Academy";
	static int track=0;

	Course(String name,int duration,int enrolled){
		this.name=name;
		this.duration=duration;
		this.enrolled=enrolled;
		track++;
	}
	static class Platform{
		public void out() {
			System.out.println("Courses are hosted on CodeMentor");
		}
		
	}
		
		
	}

