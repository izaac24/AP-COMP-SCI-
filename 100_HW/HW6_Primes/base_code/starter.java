import java.util.Scanner;

public class starter{
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int divider = 2;
        while (divider <= Math.sqrt(num)) {
            if (num % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }
    public static void printPrimes(int limit) {
        System.out.println("Prime numbers under " + limit + ":");
        int num1 = 2;
        while (num1 < limit) {
            if (checkPrime(num1)) {
                System.out.print(num1 + " ");
            }
            num1++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        printPrimes(input);
    }
}
