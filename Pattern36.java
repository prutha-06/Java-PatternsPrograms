package com.kn.printPatterns;

public class Pattern36 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 3 || j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
//i=row, j=column
//i==3 || j==3
//    *    =(1,3)
//    *    =(2,3)
//* * * * *=(3,1)(3,2)(3,3)(3,4)(3,5)
//    *    =(4,3)
//    *    =(5,3)
