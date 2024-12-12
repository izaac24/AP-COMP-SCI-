import pkg.*;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Magic Squares would you like to see");
		int Num = sc.nextInt();
		System.out.println(CVMath.MagicSquare(Num));
	}
}
