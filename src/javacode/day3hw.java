package javacode;
import profile.userinput;
import greeting.greetingdisplay;
public class day3hw {

	public static void main(String[] args) {
		userinput a=new userinput();
		String name=a.inputone();
	greetingdisplay b=new greetingdisplay();
	   System.out.println(b.greetingone() + name);
		

	}

}
