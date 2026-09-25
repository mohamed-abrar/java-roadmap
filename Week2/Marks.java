package Week2;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter ur Tamil Mark :");
        int tamil = sc.nextInt();

         System.out.print("Enter ur English Mark :");
        int English = sc.nextInt();

         System.out.print("Enter ur Maths Mark :");
        int Maths = sc.nextInt();

         System.out.print("Enter ur Science Mark :");
        int Science = sc.nextInt();

         System.out.print("Enter ur Social Mark :");
        int Social = sc.nextInt();

        int total = (tamil + English + Maths + Science + Social);
        System.out.println("Total :" + total);

        float Average = (total / 5.0f);
        System.out.println("Average :"+  Average);

        float Percentage =  ((total / 500.0f)*100);
        System.out.println("Percentage :"+ Percentage + " % ");
    }
}
