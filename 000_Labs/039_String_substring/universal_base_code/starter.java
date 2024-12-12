/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		System.out.print("What is a word or phrase: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println();
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.substring(i,i + 1));
		
		}
	}
}


		
