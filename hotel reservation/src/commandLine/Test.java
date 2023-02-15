package commandLine;
import java.util.Scanner;

public class Test {

    static int menuItem, aprice;
    static double price1, price2, price3;

    public static void main(String... args) {

        final Scanner sc = new Scanner(System.in);

        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Please select an option from the menu:");
            System.out.println("1. Enter House Prices");
            System.out.println("2. Enter furniture Price");
            System.out.println("3. calculate result");
            System.out.println("4. Exit System");
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.println("House Details:");
                    System.out.println("Enter price1: $");
                    price1 = sc.nextDouble();
                    System.out.println("Enter price2: $");
                    price2 = sc.nextDouble();
                    System.out.println("Enter price3: $");
                    price3 = sc.nextDouble();
                    break;
                case 2:System.out.println("Enter the price of furniture: $");
                    aprice = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Result");
                    break;
                case 4:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Unknown option");
                    break;
            }
        }
    }
}


