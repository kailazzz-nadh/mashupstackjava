package javacode;

public class day8cw {
	interface animals{
		void makesound();
		void move();
	}
	class bird implements animals{
		public void makesound() {
			System.out.println("Chirp");
		}
		public void move() {
			System.out.println("Fly");
		}
	}
	class dog implements animals{
		public void makesound() {
			System.out.println("bark");
		}
		public void move() {
			System.out.println("run");
		}
	}
	
	public class zoo{

	public static void main(String[] args) {
		day8cw obj = new day8cw();
		bird b=obj.new bird();
		dog d=obj.new dog();
		b.makesound();
		b.move();

		d.makesound();
		d.move();

	}

}
}
