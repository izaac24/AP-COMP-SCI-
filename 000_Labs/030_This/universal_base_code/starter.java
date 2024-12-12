/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
        	default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int numdup = 0;
		int num = (int)(Math.random()*20 + 40);
		PooleDwarf d1 = new PooleDwarf(randName(),num);
		PooleDwarf d2 = new PooleDwarf(randName(),num);
		PooleDwarf d3 = new PooleDwarf(randName(),num);
		PooleDwarf d4 = new PooleDwarf(randName(),num);
		PooleDwarf d5 = new PooleDwarf(randName(),num);
		PooleDwarf d6 = new PooleDwarf(randName(),num);
		PooleDwarf d7 = new PooleDwarf(randName(),num);
		if(d1.isSameName(d2) == true){
			numdup++;
		}
		if(d1.isSameName(d3) == true){
			numdup++;
		}
		if(d1.isSameName(d4) == true){
			numdup++;
		}
		if(d1.isSameName(d5)== true){
			numdup++;
		}
		if(d1.isSameName(d6) == true){
			numdup++;
		}
		if(d1.isSameName(d7) == true){
			numdup++;
		}
		System.out.println("There are " + numdup + " duplicate names.");
		if(numdup > 0){
			System.out.print("The duplicate names was: " + d1.getName());
		}
		
	}
}
