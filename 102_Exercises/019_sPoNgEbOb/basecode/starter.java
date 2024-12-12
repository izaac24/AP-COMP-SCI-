/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentance: ");
		String sentance = sc.nextLine();
		
		while(true){
			if(sentance.indexOf(" ") == -1){
				
				break;
			}
			int space = sentance.indexOf(" ");
			String word = sentance.substring(0,space);
			System.out.println(spongeCase(word) + " ");
		}

	}
	public static String spongeCase(String word){
		String result = " ";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i,i+1);
			if(i % 2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			result = result + letter;
		}
		return result;
	}
}
