/*
 *	Author:  Isaac
    Worked with: Declan
 *  Date:9/9/24
*/


import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your class? Warrior, Wizard, or rogue: ");
		String role;
		role = sc.nextLine();
		System.out.println(role);
		if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("Wizard, good choice. Spellcasters ussualy are ranged so your gonna want to put more skill points into int and wisdom rather then con or strength.");
		}
		else if(role.equals("rogue") || role.equals("Rogue")){
			System.out.println("My personal favorite, the rogue. Good at range and good in melee. Very skilled in the art of death and stealth. Dex and con are good choices for a rogue to put their skill points into.");
		}
		else if(role.equals("Warrior") || role.equals("warrior")){
			System.out.println("The warrior is a very broad class. Ussualy ur gonna want to put ur skill points into con and strength becasue ur gonna be in melee for combat.");
		}
		else{
			System.out.println("I think you spelled that wrong");
		}
	}
}
