package com.kn.printPatterns;

public class Pattern6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((char) (96 + i)+" ");//printing on row
			}
			System.out.println();
		}

	}

}
//i=row j=column
//a a a a a=97=96+i
//b b b b b=98=96+i
//c c c c c=99=96+i
//d d d d d=100=96+i
//e e e e e=101=96+i
