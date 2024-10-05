

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Initial wallet amount
        double walletAmount = 777777.0;
        List<Double> wallet = new ArrayList<>();
        Random random = new Random();
        boolean processing = true;
        while(processing){
            // Current wallet amount
            System.out.println("Current wallet amount " + walletAmount + " KZT");
            System.out.println("--------");

            // Generate random price of item to pay between 100 and 18000
            double amountToPay = 100 + (20000 - 100) * random.nextDouble();
            System.out.printf("The product price is: %.2f KZT%n", amountToPay);
            System.out.println("--------");


            System.out.println();
            System.out.println("Choose the payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. Bank Transfer");
            System.out.println("4. Exit and Show wallet");
            int choice = scanner.nextInt();

            // Exit
            if(choice == 4){
                processing = false;
                break;
            }
            // Checking Wallet
            if(walletAmount < amountToPay){
                System.out.println("Not enough money! Payment cant be done: " + amountToPay + " KZT");
                continue;

            }

            // Choosing the payment method
            PaymentMethod paymentMethod = null;
            switch (choice){
                case 1 :
                    paymentMethod = new CreditCardPayment();
                    break;

                case 2 :
                    paymentMethod = new PayPalPayment();
                    break;

                case 3 :
                    paymentMethod = new BankTransferPayment();
                    break;

                default:
                    System.out.println("Invalid choice, please try again!");
                    continue;
            }

            // Payment details
            paymentMethod.collectPaymentDetails();

            // Process the payment
            PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethod);
            paymentProcessor.process(amountToPay);

            // Substruct the price from wallet
            walletAmount -= amountToPay;
            wallet.add(amountToPay);
            System.out.println("Processed payment of: " + amountToPay + " KZT");

        }
        // Displaying wallet
        System.out.println("\n--- Wallet Summary ---");
        double totalAmount = 0;
        for (double processedAmount  : wallet){
            System.out.println("Processed payment: " + processedAmount + " KZT");
            totalAmount += processedAmount;
        }
        System.out.println("Total processed amount: " + totalAmount + " KZT");
        System.out.println("Remaining wallet amount: " + walletAmount + " KZT");

        scanner.close();

    }
}
