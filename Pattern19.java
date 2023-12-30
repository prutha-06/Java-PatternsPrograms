package com.kn.printPatterns;

public class Pattern19 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print(6-i);
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
//5 5 5 5 5=6-i
//  4 4 4 4=6-i
//    3 3 3=6-i
//      2 2=6-i
//        1=6-i


