package javacode;
import java.util.Scanner;
import java.time.LocalDateTime;

public class day7hw {
	public double calculatetotal(int quantity[],int price[]) {
		double total=0;
		for(int i=0;i<price.length;i++) {
			total+=price[i]*quantity[i];
		}
		if (total>500) {
			total=total-(total*0.10);
		}
		return total;
	}
	

	public static void main(String[] args) {
		String items[]= {"Rice", "Sugar", "Oil", "Soap", "Milk"};
		int price[]= {50, 40, 100, 25, 30};
		
		Scanner input=new Scanner(System.in);
		try {
			int quantity[]=new int[items.length];
			for (int i = 0; i < items.length; i++) {

                System.out.println("Item: " + items[i]);
                System.out.println("Price: Rs." + price[i]);

                System.out.print("Enter quantity: ");
                quantity[i] = input.nextInt();
			
            }
		
			day7hw obj=new day7hw();
			double finalamount=obj.calculatetotal(quantity, price);
			System.out.println("Final amount is:"+finalamount);
			 System.out.println("Purchase date and time: " + LocalDateTime.now());
		}catch(Exception e) {
			 System.out.println("Invalid input! Please enter a number.");
		}
			
input.close();
		}

	}


