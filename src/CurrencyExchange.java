import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        double exchangeRateTemp;


        System.out.print(
                "Enter the exchange rate from US dollars to Chinese RMB: "
        );
        double exchangeRate = input.nextDouble();

        System.out.print(
                "Press 0 if you are exchanging dollars to Chinese RMB and press 1 if you are exchanging fra Chinese RMB to US dollars: "
        );
        int choice = input.nextInt();
        if (choice == 0)
            System.out.println(
                    "You chose US dollars to Chinese RMB"
            );
        else
            System.out.println(
                    "You choose to exchange from Chinese RMB to US dollars"
            );


        System.out.print(
                "Enter the amount you want to exchange: "
        );
        double amount = input.nextDouble();

        if (choice == 1) {
            exchangeRateTemp = exchangeRate;
            exchangeRate = 1 / exchangeRateTemp;
        }

        if (choice == 0)
            System.out.print(
                    "You have changed " + amount + " US Dollars to " + (amount * exchangeRate) + " Chinese RMB"
            );
        else
            System.out.print(
                    "You have changed " + amount + " Chinese RMB to " + (amount * exchangeRate) + " US Dollars"
            );

    }
}
