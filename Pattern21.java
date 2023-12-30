package com.kn.printPatterns;

public class Pattern21 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print((char)(70-i));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
//i=row, j=column
//i<=j
//i=1, j=1,2,3,4,5
//i=2, j=1,2,3,4,5
//E E E E E=70-i
//  D D D D=70-i
//    C C C=70-i
//      B B=70-i
//        A=70-i
