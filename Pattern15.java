package com.kn.printPatterns;

public class Pattern15 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print(i + " ");//printing on row
				} else {
					System.out.print("");//printing on row
				}

			}
			System.out.println();
		}
	}

}
//i=row, j=column
//i>=j
//i=1, j=1,2,3,4,5
//i=2, j=1,2,3,4,5
//.....
//1        =i
//2 2      =i
//3 3 3    =i
//4 4 4 4  = i
//5 5 5 5 5=i
