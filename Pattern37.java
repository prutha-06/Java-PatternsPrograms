package com.kn.printPatterns;

public class Pattern37 {

	public static void main(String[] args) {
		boolean k=true;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9;j++) {
				if(j>=(6-i) && j<=(4+i)&& k) {
					System.out.print("*");
					k=false;
				}else {
					System.out.print(" ");
					k=true;
				}
			}
			System.out.println();
		}

	}

}
//i=row, j=column
//
//    *     =
//   * *    =
//  * * *   = 
// * * * *  =
//* * * * * =
