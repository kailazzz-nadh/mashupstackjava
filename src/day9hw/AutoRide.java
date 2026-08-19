package day9hw;

 class AutoRide extends Ride {
	 int calculateFare(int distance) {
		return distance*10;
	}
	 void rideType() {
			System.out.println("Autoride");
		}

	
}
