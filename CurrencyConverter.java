
import java.util.Scanner;
/**
 * CurrencyConverter
 */
public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("1 Rupee");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        // convert the amount
        switch (choice) {
            case 1:
                rupeeToOther(amount);
                break;
            case 2:
                dollarToOther(amount);
                break;
            case 3:
                euroToOther(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void rupeeToOther(double amt) {
        System.out.println("1 Rupee = " + 0.013 + " Dollar");
        System.out.println();
        System.out.println(amt + " Rupee = " + (amt * 0.013) + " Dollar");
        System.out.println();
        System.out.println("1 Rupee = " + 0.012 + " Euro");
        System.out.println();
        System.out.println(amt + " Rupee = " + (amt * 0.012) + " Euro");
        System.out.println();
    }

    public static void dollarToOther(double amt) {
        System.out.println("1 Dollar = " + 79.37 + " Rupee");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 79.37) + " Rupee");
        System.out.println();
        System.out.println("1 Dollar = " + 0.98 + " Euro");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
    }

    public static void euroToOther(double amt) {
        System.out.println("1 Euro = " + 80.85 + " Rupee");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 80.85) + " Rupee");
        System.out.println();
        System.out.println("1 Euro = " + 1.02 + " Dollar");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
    }
}