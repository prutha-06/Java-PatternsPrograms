package com.kn.printPatterns;

public class Pattern7 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print((char)(64+j)+" ");//printing on row
			}
			System.out.println();
		}

	}

}
//i=row, j=column
//A B C D E==64+j
//A B C D E==64+j
//A B C D E==64+j
//A B C D E==64+j
//A B C D E==64+j
