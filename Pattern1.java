package com.kn.printPatterns;

public class Pattern1 {

	public static void printPatterns(int row, int col) {
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPatterns(5,5);
	}
}
