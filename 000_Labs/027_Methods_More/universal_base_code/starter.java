/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter c1 = new myCharacter();
		c1.setRole("Rogue");
		c1.setStr(14);
		c1.setDex(20);
		c1.setCha(17);
		c1.setInt(12);
		c1.myTooString();
		myCharacter c2 = new myCharacter();
		c2.setAll("wizard",11,14,19,17);
		c2.myTooString();


		
	}
}
