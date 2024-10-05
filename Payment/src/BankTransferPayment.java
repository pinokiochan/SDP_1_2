import java.util.Scanner;

public class BankTransferPayment implements PaymentMethod{
    private String accountNum;
    private String routingNum;
    @Override
    public void processPayment(double amount){
        System.out.println();
        System.out.println("Processing bank transfer payment of: " + amount + " KZT");

    }
    @Override
    public void collectPaymentDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bank account number: ");
        accountNum = scanner.nextLine();
        System.out.print("Enter bank routing number: ");
        routingNum = scanner.nextLine();
    }

}
