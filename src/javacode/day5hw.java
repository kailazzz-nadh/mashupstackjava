package javacode;

public class day5hw {

	public static void main(String[] args) {
		int arr[][]= {{500,20,8},{100,300,14},{80,21,10},{12,100,28},{14,6,13}};
		for(int j=0;j<arr[0].length;j++) {
			int total=0;
			for(int i=0;i<arr.length;i++) {
				total=total+arr[i][j];
				
				
			}
			System.out.println("product"+(j+1)+" "+"totalsales"+total);
			
			if(total>=500) {
				System.out.println("Target achieved");
		
			}
			else if(total>300 && total<499) {
				System.out.println("Average performance");
			}
			else if( total<300) {
				System.out.println("Needs Improvement");
			}
			System.out.println();
		}

	}

}
