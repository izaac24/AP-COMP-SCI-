/*
 *	Author:  Isaac
    Worked with:
 *  Date:9/9/24
*/


import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int skill = 30;
		System.out.print("What is your Characters name:");
		String name1 = sc.nextLine();
		System.out.print("What is your characters title:");
		String title1 = sc.nextLine();
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
		System.out.println("You now have 30 skill points to put into 5 different skills. Strength, Dexterity, Consitution, intelligence, wisdom, charsima(Maximum of 10 skill points for each skill)");
		System.out.print("First up is con, how many points in con:");
		int con = sc.nextInt();
		skill = skill - con;
		System.out.print("you now have " + skill + " points. ");
		
		System.out.print("Now Wis, how many points in wis:");
		int wis = sc.nextInt();
		skill = skill - wis;
		System.out.print("you now have " + skill + " points. ");
		
		System.out.print("Now int, how many points in int:");
		int int1 = sc.nextInt();
		skill = skill - int1;
		System.out.print("you now have " + skill + " points. ");
		
		System.out.print("now we have dex, how many points in dex:");
		int dex = sc.nextInt();
		skill = skill - dex;
		System.out.print("you now have " + skill + " points. ");
		
		System.out.print(" Now we have Charisma, how many points in Charisma:");
		int cha = sc.nextInt();
		skill = skill - cha;
		System.out.print("you now have " + skill + " points. ");
		
		System.out.print("Lastly we have Strength, how many points in Strength:");
		int str = sc.nextInt();
		skill = skill - str;
		System.out.println("you now have " + skill + " points. ");
		System.out.println("Your charcters name is " + name1 + " " + title1 + ". You are a " + role);
		System.out.println("Your Strength is " + str + ", your dex is " + dex + ", your con is " + con + ", your int is " + int1 + ", your wis is " + wis + ", and your cha is " + cha + ".");
	}
}
