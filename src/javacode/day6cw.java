package javacode;

public class day6cw {
	public static void main(String args[]) {
		int arr[]= {20, 15, 30, 90, 25};
		int total=0;
		int out=0;
			
		for(int i:arr) {
			if(i==0) {
				System.out.println("Out of stock:"+i);
				out=1;
				break;
			}
			 total+=i;
		}
		if (out==0) {
			if(total<50) {
				System.out.println("Low stock:"+total);
			}
			else if(total>50 && total<100) {
				System.out.println("Moderate Stock:"+total);
			}
			else {
				System.out.println("Good Stock:"+total);
			}
		}
	}
}



