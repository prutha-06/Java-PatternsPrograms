package com.kn.printPatterns;

public class Pattern38 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j || i==1 ||j==1 || 6==(i+j)|| i==5 || j==5) {
				//if((i==j && j>=i) || ( j>=(6-i) && i>=j) ){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
//
//
//* * * * *= (1,1)(1,2)(1,3)(1,4)(1,5)
//* *   * *= (2,1)(2,2)     (2,3)(2,5)
//*   *   *= (3,1)     (3,3)     (3,5)
//* *   * *= (4,1)(4,2)     (4,4)(4,5)
//* * * * *= (5,1)(5,2)(5,3)(5,4)(5,5)
