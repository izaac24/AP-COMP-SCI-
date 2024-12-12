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
        role = "no role set";
        Cha = 0;
        Str = 0;
        Dex = 0;
        Int = 0;
    }
    public void myTooString(){
        System.out.println("***************************");
        System.out.println("You role is " + role);
        System.out.println("Your Charisma is " + Cha);
        System.out.println("Your Strength is " + Str);
        System.out.println("Your Dexterity is " + Dex);
        System.out.println("Your Inteligince is " + Int);
        System.out.println("***************************");
        System.out.println("");
    }
    
    public String setRole(String a){
        if(a.equals("Wizard") || a.equals("wizard")){
            role = a;
        }
        else if(a.equals("Warrior") || a.equals("warrior")){
            role = a;
        }
        else if(a.equals("Rogue") || a.equals("rogue")){
            role = a;
        }
        else{
            role = "invalid role";
        }
        return role;
    }
    
    public int setStr(int num){
        if(num < 0){
            Str = 0;
            return Str;
        }
        Str = num;
        return Str;
    }
    
    public int setDex(int num){
        if(num < 0){
            Dex = 0;
            return Dex;
        }
        Dex = num;
        return Dex;
    }
    
    public int setInt(int num){
        if(num < 0){
            Int = 0;
            return Int;
        }
        Int = num;
        return Int;
    }
    
    public int setCha(int num){
        if(num < 0){
            Cha = 0;
            return Cha;
        }
        Cha = num;
        return Cha;
    }
    
    public boolean setAll(String a, int Snum, int Dnum, int Inum, int Cnum){
        if(Snum < 0){
            return false;
        }
        
        if(Dnum < 0){
            return false;
        }
        
        if(Inum < 0){
            return false;
        }
        
        if(Cnum < 0){
            return false;
        }
        role = a;
        Str = Snum;
        Dex = Dnum;
        Int = Inum;
        Cha = Cnum;
        return true;
    }
    
}