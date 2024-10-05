import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThemeFactory factory = null;


        System.out.println("Choose the theme:");
        System.out.println("1. Light Theme");
        System.out.println("2. Dark Theme");

        int choice = scanner.nextInt();
        scanner.nextLine();


        switch (choice) {
            case 1:
                factory = new LightThemeFactory();
                break;
            case 2:
                factory = new DarkThemeFactory();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                scanner.close();
                return;
        }


        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();


        button.display();
        checkbox.display();

        scanner.close();
    }
}
