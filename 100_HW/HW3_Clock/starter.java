/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What day of the week is it? ");
		String day = sc.nextLine();
		if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
			System.out.print("ok, alarm clock set to 7:00 am");
		}
		else if(day.equals("Saturday") || day.equals("Sunday")){
			System.out.print("good to know, setting alarm clock to 10:00 am. Enjoy your extra sleep");
		}
		
	}
}
