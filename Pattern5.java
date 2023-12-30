package com.kn.printPatterns;

public class Pattern5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((char)(64 + i)+" ");// printing on row
			}
			System.out.println();
		}

	}
}
//i=row, j=column
//A A A A A=65=64+i
//B B B B B=66=64+i
//C C C C C=67
//D D D D D=68
//E E E E E=69
