package com.kn.printPatterns;

public class Pattern27 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=(6-i)) {
					System.out.print((char)(70-i)+" ");
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
//E E E E E =i=1, j=1 to 5
//D D D D   =i=2, j=1 to 4
//C C C     =i=3, j=1 to 3
//B B       =i=4, j=1 to 2
//A         =i=5, j=1

