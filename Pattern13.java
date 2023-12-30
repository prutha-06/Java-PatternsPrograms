package com.kn.printPatterns;

public class Pattern13 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
//i=row, j=column
//i>=j
//*         =i=1=j=5
//* *       =i=2=j=4
//* * *     =i=3=j=3===="*"
//* * * *   =i=4=j=2
//* * * * * =i=5=j=1
