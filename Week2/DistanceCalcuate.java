package Week2;

import java.util.Scanner;

public class DistanceCalcuate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter Distance  :");
        float Distance  = sc.nextFloat();

        System.out.print("Enter Vehicale Milage :");
         float Milage  = sc.nextFloat();

        System.out.print("Enter Fuel price  :");
        float FuelPrice  = sc.nextFloat();

        float fuelQuantity = (Distance / Milage);
        System.out.println("Fuel Quantity :" +  fuelQuantity + "liter ");

        float travelCost = (fuelQuantity * FuelPrice);
        System.out.println("Travel Cost : $" + travelCost);



    
    }
    
}
