/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine();
		System.out.println("Original sentance: "  + sentance);
		String reverse = " ";
		while(true){
            if(sentance.indexOf(" ") == -1){
                reverse = sentance + " " + reverse;
                break;
            }
            int space = sentance.indexOf(" ");
            String word = sentance.substring(0,space);
            sentance = sentance.substring(space + 1);
            reverse = word + " " + reverse;
            
        }
        System.out.print("Reverse sentance: " + reverse);

		
	}
}
