package com.kn.printPatterns;

public class Pattern34 {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=5;j++) {
				if(i>=j && i<=(4+j)) {
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}
//i=row, j=column
//i>=j && i<=(4+j)
//j'th row is common=5
//                             i  j   |  i  j
//*         =i=1  1            5>=1      5<=5
//* *       =i=2  2 2          5>=2      5<=6
//* * *     =i=3  3 3 3        5>=3      5<=7
//* * * *   =i=4  4 4 4 4      5>=4      5<=8
//* * * * * =i=5  5 5 5 5 5    5>=5      5<=9
//* * * *   =i=6  6 6 6 6
//* * *     =i=7  7 7 7
//* *       =i=8  8 8
//*         =i=9  9
//
