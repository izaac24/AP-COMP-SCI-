/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] a = new int [1001];
		 int num = 0;
		 int num3 = 3;
		 while(num < 1000){
		 	a[num] = num3;
		 	num3 = num3 + 3;
		 	System.out.print(a[num] + ", ");
		 	num++;
		 }
		 System.out.println();
		 System.out.println();
		 int [] b = new int [1001];
		 int q = 0;
		 int w = 1000;
		 while(q < 1000){
		 	b[q] = w;
		 	w--;
		 	System.out.print(b[q]+ ", ");
		 	q++;
		 }
		 
	}
}
