package com.kn.printPatterns;

public class Pattern22 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print((char)(70-j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();System.out.println();
		}

	}
}
//i=row, j=column
//i<=j
//i=1, j=1,2,3,4,5
//i=2, j=1,2,3,4,5
//E D C B A=70-j
//  D C B A=70-j
//    C B A=70-j
//      B A=70-j
//        A=70-j
