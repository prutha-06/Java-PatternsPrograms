package com.kn.printPatterns;

public class Pattern31 {

	public static void main(String[] args) {
		for(int i=1;i<=5; i++) {
			for(int j=1; j<=9; j++) {
				if((j>=(6-i))&&(j<=(4+i))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
//i=row, j= column
//(j>=(6-i) && j<=(4+i))
//j'th row is common =5             5  i    |  5  i 
//    *     =i=1         5        = j>=5       j<=5
//   ***    =i=2       4 5 6      = j>=4       j<=6 
//  *****   =i=3     3 4 5 6 7    = j>=3       j<=7
// *******  =i=4   2 3 4 5 6 7 8  = j>=2       j<=8
//********* =i=5 1 2 3 4 5 6 7 8 9= j>=1       j<=9
//
//
