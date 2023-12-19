import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int atmNumber = 12345;
        int atmPin = 123;

        System.out.println("Welcome to ATM machine");

        boolean isAtmNumberValid = false;

        Scanner in = new Scanner(System.in);

        while (!isAtmNumberValid) {
            System.out.println("Enter ATM number: ");
            int receivedAtmNumber = in.nextInt();
            if (receivedAtmNumber != atmNumber) {
                System.out.println("ATM number is wrong");
            } else {
                isAtmNumberValid = true;
            }
        }

        boolean isPINValid = false;

        while (!isPINValid) {
            System.out.println("Enter pin: ");
            int receivedPin = in.nextInt();
            if (receivedPin != atmPin) {
                System.out.println("PIN is wrong");
            } else {
                isPINValid = true;
            }
        }

        System.out.println("1. View available money\n2. Withdraw amount\n3. Deposit amount\n4.View history of operations\n5.Exit");
        System.out.println("Enter number of menu: ");
        int numberOfMenu = in.nextInt();
        switch (numberOfMenu){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
        }
    }
}
