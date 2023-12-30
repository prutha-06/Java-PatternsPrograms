package com.kn.printPatterns;

public class Pattern33 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				//at least one should be true
				if((j<=(6-i)) || (j>=(4+i))) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
//i=row, j= column
//(j<=(6-i)||(j<=(4+i)))
//j'th column is common =5              j  i  | j  i
//********* =i=1    1 2 3 4 5 6 7 8 9 = 5>=5    5<=5
//**** **** =i=2    1 2 3 4   6 7 8 9 = 5>=4    5<=6
//***   *** =i=3    1 2 3       7 8 9 = 5>=3    5<=7
//**     ** =i=4    1 2           8 9 = 5>=2    5<=8
//*       * =i=5    1               9 = 5>=1    5<=9
