package javacode;

public class day5cw {

	public static void main(String[] args) {
		int score[]= {50,100,80,74,60};
		for(int i=0;i<score.length;i++) {
			if(score[i]>=90) {
				System.out.println(score[i]+" "+"Excellent");
			}
			if(score[i]>=75 && score[i]<=89) {
				System.out.println(score[i]+" "+"Good");
			}
			if(score[i]>=50 && score[i]<=74) {
				System.out.println(score[i]+" "+"Average");
			}
			if( score[i]<=50) {
				System.out.println(score[i]+" "+"Failed");
			}
		}
			
		}

	

}
