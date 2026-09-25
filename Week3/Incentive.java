package Week3;

import java.util.Scanner;

public class Incentive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double SalesTarget = 200000;
        double baseSalary = 20000;
        double incentive = 0;

        System.out.print("Enter ur total Sales :");
        double totalSales = sc.nextDouble();

        if (totalSales <= 50000) {
            incentive = 2;
        } else if (totalSales <= 70000) {
            incentive = 3.5;
        } else if (totalSales <= 110000) {
            incentive = 4;
        } else if (totalSales <= 150000) {
            incentive = 4.5;
        } else {
            incentive = 5;
        }
        double totalIncentive = totalSales * incentive / 100;

        double monthlyEarning = baseSalary + totalIncentive;
        System.out.println("Total earning :" + monthlyEarning);
    }
}
