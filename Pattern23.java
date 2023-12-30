package com.kn.printPatterns;

public class Pattern23 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=(6-i)) {
					System.out.print("*");//printing on row
				}else {
					System.out.print(" ");//printing on row
				}
			}
			System.out.println();
		}
	}

}
//i=row, j=column
//j<=(6-i)
//* * * * * =i=1,j=1,2,3,4,5
//* * * *   =i=2,j=1,2,3,4
//* * *     =i=3,j=1,2,3
//* *       =i=4,j=1,2
//*         =i=5,j=1
