/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] Warrior = new Warrior[100];
		Wizard[] Wizard = new Wizard[100];
		int q = 0;
		int w = 0;
		for(int i = 0; i < Warrior.length; i++){
			Warrior[i] = new Warrior();
		}
		for(int i = 0; i < Wizard.length; i++){
			Wizard[i] = new Wizard();
		}
		while(true){
            if(q > 99){
                int a = 100 - w;
                System.out.println("The wizards won with " + a + " left in their army");
                break;
            }
            if(w > 99){
                int b = 100 - q;
                System.out.println("The wizards won with " + b + " left in their army");
                break;
            }
            Wizard[w].attack(Warrior[q]);
            Warrior[q].attack(Wizard[w]);
            if(Warrior[q].isDead()){
                q++;
            }
            if(Wizard[w].isDead()){
                w++;
            }
        }
    }
}
