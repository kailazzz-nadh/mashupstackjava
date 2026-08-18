package javacode;




	interface vehicles{
		void start();
		void stop();
	}
	interface fuelbased{
		void refuel();
	}
	class car implements vehicles,fuelbased{
		public void start() {
			System.out.println("Car engine started");
		}
		public void stop() {
			System.out.println("car engine stops");
		}
		public void refuel() {
			System.out.println("car is refueling at the station");
		}
	}
	class ElectricScooter implements vehicles{
		public void start() {
			System.out.println("ElectricScooter powered on");
		}
		public void stop() {
			System.out.println("ElectricScooter powered off");
		}
	}
	public class day8hw{
	public static void main(String[] args) {
		
		 car c = new car();

	        c.start();
	        c.refuel();
	        c.stop();

	        ElectricScooter e = new ElectricScooter();

	        e.start();
	        e.stop();
		
	}
	

	}


