package com.kn.printPatterns;

public class Pattern35 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==i || j==(6-i)) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
//i=row,j=column
//i==j || j==(6-j)
//
//*   *   =(1,1)(1,5)
// * *    =(2,2)(2,4)
//  *     =(3,3)
// * *    =(4,2)(4,4)
//*   *   =(5,1)(5,5)
//
