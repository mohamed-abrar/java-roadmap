package Week2;
import java.util.Scanner;

public class Telecom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  Recharge  Amount :");
        int Recharge = sc.nextInt();

        System.out.print("Enter tax Percentage :");
        int TaxPercentage = sc.nextInt();
   
       float taxAmount = ((Recharge * TaxPercentage) / 100);
        System.out.println("Tax Amount :" + taxAmount);

        float finalAmount = (taxAmount + Recharge);
        System.out.println("Final Payable amount :" + finalAmount);
    }
}
