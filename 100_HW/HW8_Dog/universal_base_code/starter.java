/*
 *	Author: Isaac
 *  Date:10/22/24
 *	Collaborator(s): Declan
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog dog1 = new Dog();
		dog1.setName("Oppy");
		dog1.setAge(24);
		
		Dog dog2 = new Dog();
		dog2.setName("Bruno");
		dog2.setBreed("Great Dane");
		
		boolean a = dog1.isSleeping();
		boolean b = dog2.isSleeping();
		if(a == true){
			System.out.print("The first dog is asleep. ");
		}
		if(a == false){
			dog1.bark();
		}
		if(a == false && b== true){
			dog2.bark();
		}
		if(a == false && b == false){
			dog2.bark();
		}
		if(a == true && b == true){
			System.out.print("Both dogs are asleep");
		}
		if(a == true && b == false){
			System.out.print("");
		}
	}
}
