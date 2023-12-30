package com.kn.printPatterns;

public class Pattern20 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print(6-j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
//i=row, j=column
//i<=j
//i=1, j=1,2,3,4,5
//i=2, j=1,2,3,4,5
//5 4 3 2 1= 6-j
//  4 3 2 1= 6-j
//    3 2 1= 6-j
//      2 1= 6-j
//        1= 6-j
