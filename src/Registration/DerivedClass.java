package Registration;
class BaseClass{
   public void myMethod(){
	System.out.println("This is Overridden Method");
   }
}
public class DerivedClass extends BaseClass{

	@Override
   public void myMethod(){
	System.out.println("This is Overriding Method");
   }
   public static void main(String args[]){
	DerivedClass obj = new DerivedClass();
	obj.myMethod();
   }
}