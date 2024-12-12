/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void onGoing(){
		String[] arr = {"Really" , "tell me more", "I didn't know that" , "That makes so much sense" , "Your capping fool" , "yes" , "no" , "I wonder why" , "just do it" , "you should think about that more"};
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("What do you want to say(something sassy): ");
			String sass = sc.nextLine();
			System.out.println(arr[(int)(Math.random() * 9)]);
		
		}
	}
	public static void main(String args[]) {
		String[] arr = {"\t" , "\b" , "\n" , "\r" , "\f" , "\'" , "\"" , "\\" };
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Tell me something annoying or rude: ");
		String sass = sc.nextLine();
		System.out.println(arr[(int)(Math.random() * 8)] + arr[(int)(Math.random() * 8)] + sass + arr[(int)(Math.random() * 8)] + arr[(int)(Math.random() * 8)]);
		}
		
		


		
	}
}
