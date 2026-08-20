package day9hw;
import java.util.Scanner;

public class BookingApp {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your ride auto or car");
		String rider=input.nextLine();
		System.out.println("Enter your distance in km");
		int price=input.nextInt();
		input.nextLine();
		if(rider.equals("auto")) {
			Ride auto=new AutoRide();
			auto.rideType();
			System.out.println("Your total fare is"+" "+auto.calculateFare(price));
			
		}
		else {
			Ride car=new CarRide ();
			car.rideType();
			System.out.println("Your tota1 fare is"+" "+car.calculateFare(price));
			
		}
		
   input. close();
	}

}
