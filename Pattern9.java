package com.kn.printPatterns;

public class Pattern9 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(6-i+" ");//printing on rows
			}
			System.out.println();
		}

	}
}
//i=row, j=column
//5 5 5 5 5=6-i
//4 4 4 4 4=6-i
//3 3 3 3 3=6-i
//2 2 2 2 2=6-i
//1 1 1 1 1=6-i

