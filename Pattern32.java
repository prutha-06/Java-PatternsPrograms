package com.kn.printPatterns;

public class Pattern32 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				if((j>=i)&&(j<=(10-i))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
//i=row, j=column
//(j>=i)&&(j<=(10-i))
// j'th column is common=5            j  i    |   j  i                             
//********* =i=1  1 2 3 4 5 6 7 8 9   5>=1        5<=9
// *******  =i=2    2 3 4 5 6 7 8     5>=2        5<=8
//  *****   =i=3      3 4 5 6 7       5>=3        5<=7
//   ***    =i=4        4 5 6         5>=4        5<=6
//    *     =i=5          5           5>=5        5<=5
