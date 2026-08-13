package javacode;

public class day6hw {
     public static void main(String args[]) {
    	 int arr[]= {100, 360, 91, 90, 90};
    	int total=0;
    	int avg=0;
    	int failed=0;
    	 for(int i:arr) {
    		 total+=i;
    		 
    		 avg=total/arr.length;
    		 if(i<35) {
    			 System.out.println("Failed");
    			 failed=1;
    		 }
    	 }
    	 if(failed==0) {
    	 if(avg>=90) {
    		 System.out.println("Grade A:"+avg);
    		 
    	 }
    	 else if(avg<=89 && avg>=75) {
    		 System.out.println("Grade B:"+avg);
    	 }
    	 else if(avg<=74 && avg>=60) {
    		 System.out.println("Grade C:"+avg);
    	 }
    	 else {
    		 System.out.println("Grade D:"+avg);
    	 }
    	 
    	 
     }
}
}
