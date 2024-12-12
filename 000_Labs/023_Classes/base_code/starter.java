/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
class Character{
	String role = new String("Warrior");
	int Cha = 10;
	int Str = 10;
	int Dex = 10;
	int Int = 0;
}
class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
		System.out.println(myCharacter.role);
		System.out.println("Charisma: " + myCharacter.Cha);
		System.out.println("Strength: " + myCharacter.Str);
		System.out.println("Dexterity: " + myCharacter.Dex);
		System.out.println("Inteligence: " + myCharacter.Int);



		
	}
}
