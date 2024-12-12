/*
 *	Author:  
 *  Date: 
*/
package pkg;
import java.util.Scanner;
import java.util.Random;
public class myCharacter{
    String role;
	int Cha;
	int Str;
	int Dex;
	int Int;
 	public myCharacter(){
 	    role = "Rogue";
 	    Cha = 10;
	    Str = 10;
	    Dex = 10;
	    Int = 0;
    }
    public void myTooString(){
        System.out.println("You role is " + role);
        System.out.println("Your Charisma is " + Cha);
        System.out.println("Your Strength is " + Str);
        System.out.println("Your Dexterity is " + Dex);
        System.out.println("Your Inteligince is " + Int);
    }
}