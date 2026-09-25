package Week3;

import java.util.Scanner;

public class PersonalLoan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ur Age  :");
        int Age = sc.nextInt();

        System.out.print("Enter  ur Salary  :");
        Double Salary = sc.nextDouble();

        System.out.print("Enter Existing EMI :");
        double EMI = sc.nextDouble();

        if(Age >= 21){
            if (Salary >= 30000){
                if(EMI >= Salary * 40 / 100 ){
                    System.out.println("Loan Eleigible");
                }else {
                    System.out.println("Decision : Rejected  \n Reason : Existing EMI is below of 40% .");
                }
            } else {
                System.out.println("Decision : Rejected  \n Reason : Salary below is 30,000.");
            }
        } else {
            System.out.println("Decision  : REjected  \n Reason :Age is below 21. ");
        }
         sc.close(); 
    }
  
}
