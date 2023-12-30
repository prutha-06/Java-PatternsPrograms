package com.kn.printPatterns;

public class Pattern11 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print((char)(70-i)+" ");//printing on rows
			}
			System.out.println();
		}

	}
}
//i=row, j=column
//E E E E E==70-i
//D D D D D==70-i
//C C C C C==70-i
//B B B B B==70-i
//A A A A A==70-i

	

	