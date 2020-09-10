import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double money = 1.0;
        int month = 1;
        double interest_rate = 1.0;
        double total_interest = 0;

        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter number of months: ");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interest_rate = input.nextDouble();

        for (int i = 0; i < month; i++) {
            total_interest += money * (interest_rate/100)/12 * month;
        }

        System.out.println("Total of interest: " + total_interest);
    }
}
