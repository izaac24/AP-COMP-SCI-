/*
 *	Author:ISaac
 *  Date: 11/7/24
 * 	Collaborator(s): declan
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int numd = 0;
		int [] arr = new int [20];
		for(int egg = 0; egg < arr.length; egg++){
			arr[egg] = (int)(Math.random() * 9 + 1);
		}
		System.out.print("The numbers are ");
		for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
		}
		System.out.println();
		int rnum = (int)(Math.random() * 9 + 1);
		System.out.println("The random number to find duplicates of is " + rnum);
		for(int chunk = 0; chunk < arr.length; chunk++){
			if(arr[chunk] == rnum){
				numd++;
				System.out.println("The duplicate " + arr[chunk] + " is located on  index " + chunk);
				
			}
		}
		System.out.println("The number of duplicates is " + numd);
		for(int i = 0; i < 19; i++){
			if(arr[i] == arr[i + 1]){
				System.out.print("There are numbers in a row for index " + i + " and index " + (i + 1));
				System.out.println(" and the number in a row was " + arr[i]);

			}
		;
		}

	}
}
