/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman a = new Spiderman();
		a.setActor("Toby Maguire");
		a.setAge(49);
		a.setVillain("Green Goblin");
		
		Spiderman b = new Spiderman("Andrew Garfield");
		b.setAge(41);
		b.setVillain("Electro");
		
		Spiderman c = new Spiderman("John Malaney",42);
		c.setVillain("Ducktor Doom");
		
		System.out.print("The Villain is " + c.getVillain());

		
	}
}
