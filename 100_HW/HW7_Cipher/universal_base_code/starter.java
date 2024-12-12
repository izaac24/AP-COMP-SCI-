/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		Scanner rizz = new Scanner(System.in);
		System.out.print("What do you wan to encode: ");
		String aura = rizz.nextLine();
		System.out.println(Cipher.encode(aura));

	}
}
