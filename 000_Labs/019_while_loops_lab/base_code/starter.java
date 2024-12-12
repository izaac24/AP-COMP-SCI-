/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name:");
		String name1 = sc.nextLine();
		System.out.print("Now how many times would you like this name repeated:");
		int num1 = sc.nextInt();
		while(num <num1){
			System.out.println(name1);
			num = num +1;
		}



		
	}
}
