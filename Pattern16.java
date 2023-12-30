package com.kn.printPatterns;

public class Pattern16 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i>=j) {
					System.out.print((char)(64+j)+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
}
//i=row, j=column
//i>=j
//i=1, j=1,2,3,4,5
//i=2, j=1,2,3,4,5
//A        =64+j
//A B      =
//A B C    =
//A B C D  =
//A B C D E=

		