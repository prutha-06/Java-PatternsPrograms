package com.kn.printPatterns;

public class Pattern8 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((char) (96 + j) + " ");// printing on rows
			}
			System.out.println();
		}

	}

}
//i=row, j=column
//a b c d e=96+j
//a b c d e=96+j
//a b c d e=96+j
//a b c d e=96+j
//a b c d e=96+j