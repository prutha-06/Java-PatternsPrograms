package com.kn.printPatterns;

public class Pattern12 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print((char)(70-j)+" ");//printing on row
			}
			System.out.println();
		}

	}
}
//i=row, j=column
//E D B C A==70-j
//E D C B A==70-j
//E D B C A==70-j
//E D B C A==70-j
//E D B C A==70-j
