/*
 *	Author:  
 *  Date: 
 In an integer named "MyNumber", get the maximum of 5-7*3 and 8%5*7
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sentance = sc.nextLine();
        
        
        while(true){
            if(sentance.indexOf(" ") == -1){
                System.out.println(sentance);
                break;
            }
            int spaces = sentance.indexOf(" ");
            String word = sentance.substring(0,spaces);
            System.out.println(word);
            sentance = sentance.substring(spaces+1);
            
        }
	}
	
}

