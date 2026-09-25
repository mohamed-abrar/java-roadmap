package Week3;

import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ur  Bank Balance  :");
        Double Balance = sc.nextDouble();
    
        System.out.print("Enter  ur Withdraw Amount  :");
        Double Withdraw = sc.nextDouble();
    
        if((Withdraw % 100 == 0) && ( Balance >= Withdraw )&& (Balance -  Withdraw  >= 500 )) {
         System.out.println("Withdraw Approvel");
        }
        else{
            System.out.println("Rejected");
        }
        sc.close(); 
        
    }
}
