package com.kn.printPatterns;

public class Pattern30 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print((char) (64 + j));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
//i=row, j=column
//j>=i
//A B C D E =i=1, j=1,2,3,4,5
//  B C D E =i=2, j=1,2,3,4
//    C D E =i=3, j=1,2,3 
//      D E =i=4, j=1,2
//        E =i=5, j=1
