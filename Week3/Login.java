package Week3;

import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Passkey = 1234;
        int Attempt = 0;

        while (Attempt < 3) {
            System.out.print("Enter ur Email ");
             String email = sc.nextLine();

            System.out.print("Enter  ur Password ");
            int PassWord = sc.nextInt();

            if (PassWord == Passkey) {
                System.out.println("Login Successfully");
                break;
            } else {
                System.out.println(" Password incorrect");
            }
            Attempt++;
        }
        if (Attempt == 3) {
            System.out.println("Maxium 3 of Attempt Complete");
        }
    }
}
