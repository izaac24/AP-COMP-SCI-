/*
 *	Author:  
 *  Date: 
*/
package pkg;
import java.util.Scanner;
import java.util.Random;
public class myCharacter{
    public String role;
    String roguie;
      String wizie;
	public int Cha = 10;
	public int Str = 10;
	public int Dex = 10;
	public int Int = 0;
 	public myCharacter(){
 	    role = "no role";
    }
    public myCharacter(String a){
        roguie = a;
        System.out.println(roguie);
        if(roguie.equals("rogue")){
			System.out.println("You chose the rogue, this is the best choice");
			System.out.println("============================================================");
			System.out.println("Stats");
			System.out.println("Cha: " + Cha);
			System.out.println("Str: " + Str);
			System.out.println("Dex: " + Dex);
			System.out.println("Int: " + Int);
		}
		else if(roguie.equals("wizard")){
			System.out.println("You chose wizard, a spellcaster with powerful magic");
			System.out.println("============================================================");
			System.out.println("Stats");
			System.out.println("Cha: " + Cha);
			System.out.println("Str: " + Str);
			System.out.println("Dex: " + Dex);
			System.out.println("Int: " + Int);
		}
		else if(roguie.equals("warrior")){
			System.out.println("You chose warrior, a melee combat fighter");
			System.out.println("============================================================");
			System.out.println("Stats");
			System.out.println("Cha: " + Cha);
			System.out.println("Str: " + Str);
			System.out.println("Dex: " + Dex);
			System.out.println("Int: " + Int);
		}
		else{
			System.out.println("You didnt spell that right");
		}
    }
}