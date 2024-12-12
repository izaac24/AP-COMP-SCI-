package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?
	
	public Spiderman(){
		actor = "N/A";
		age = 0;
		villain = "N/A";
	}
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "N/A";
	}
	public Spiderman(int a){
		actor = "N/A";
		age = a;
		villain = "N/A";
	}
	public Spiderman(String a,int b){
		actor = a;
		age = b;
		villain = "N/A";
	}
	public Spiderman(String a,int num, String b){
		actor = a;
		age = num;
		villain = b;
	}


	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public void setVillain(String v){
		this.villain = villain;
	}
	public void setActor(String a){
		this.actor = actor;
	}
	public void setAge(int a){
		this.age = age;
	}
	public String getActor(){
		return actor;
	}
	public int setAge(){
		return age;
	}
	public String getVillain(){
		return villain;
	}
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
