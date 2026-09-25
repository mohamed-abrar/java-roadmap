import java.util.Scanner;

public class ShopBill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
         System.out.print("Enter Unit Price  :");
        double unitPrice  = sc.nextDouble();

        System.out.print("enter Quantity :");
        double Quantity  = sc.nextDouble();

        double DiscountPercentage = 10 % unitPrice;

        double SubTotal = (unitPrice * Quantity);
        System.out.println("Sub Total :" + SubTotal);

        double discountAmount = ( SubTotal * 10 / 100);
        System.out.println("Discount Amount :" + discountAmount);

        double FinalBill = (SubTotal-discountAmount);
        System.out.println("Final  amount : " + FinalBill);


    }
}
