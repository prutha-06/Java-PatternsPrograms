package com.kn.printPatterns;

public class Pattern25 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=6-i){
					System.out.print(i+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
//i=row, j=column
//j<=(6-i)
//1 1 1 1 1
//2 2 2 2
//3 3 3
//4 4
//5
