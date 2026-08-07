package javacode;

public class day1 {

	public static void main(String[] args) {
		int books=3;
		int price=275;
		double total=books*price;
		System.out.println("no. of books="+books);
		System.out.println("price of books="+price);
		System.out.println("total price ="+total);
		int discount=10;
		double discountprice=discount;
		double totaldiscount=total*(discountprice/100);
		System.out.println("discount percentage is ="+totaldiscount);
		
		
		double finalprice=total-totaldiscount;
		System.out.println("price after discount ="+finalprice);
		
		
		

	}

}
