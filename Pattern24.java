package com.kn.printPatterns;

public class Pattern24 {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=5; j++) {
				if(j<=(6-i)) {
					System.out.print(6-i+ " ");
				}else {
					System.out.print("");
				}
			}
			System.out.println();
		}

	}

}
//i=row, j=column
//j<=(6-i)
//
//5 5 5 5 5 =i=1, j=1 to 5
//4 4 4 4   =i=2, j=1 to 4
//3 3 3     =i=3, j=1 to 3
//2 2       =i=4, j=1 to 2
//1         =i=5 ,j=1

