import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Food store
        Scanner scanner = new Scanner(System.in);
        String food;
        int quantity;
        double price;
        char currency = 'R';

        System.out.print("Which food do you want to buy: ");
        food = scanner.nextLine();

        System.out.print("How many plate/s do you want to buy: ");
        quantity = scanner.nextInt();

        System.out.print("What is the price of each: ");
        price = scanner.nextDouble();

        double cost = quantity * price;

        System.out.println("The price of the " + food + "/s you bought is: " + currency + cost);



        scanner.close();

    }
}