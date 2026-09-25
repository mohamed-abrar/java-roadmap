package Week3;

import java.util.Scanner;

public class Bouns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bouns ;
        int Rating ;
        double ActualBouns;

        int  FinalBouns = 0;
        System.out.print("Enter Annual CTC :");
        double Annual = sc.nextDouble();

        System.out.print("Enter ur  Experience :");
        int Experience = sc.nextInt();

        System.out.print("Enter  ur Perfomance Rating 1-5 :");
        int Perfomance = sc.nextInt();

        if(Experience <= 2){
           Bouns =10;}
        else if (Experience <=5){
            Bouns= 15;
        }
        else if (Experience <= 7){
            Bouns = 20;}
        else{
            Bouns = 25;
        }

        if(Perfomance <=2){
            Rating = 0;
        }   
        else if(Perfomance <= 4){
            Rating = 2;
        }
        else{
            Rating = 5;
        }

        FinalBouns = Bouns + Rating;

        ActualBouns = (Annual * FinalBouns / 100 ); 

        System.out.println(" Annual Bouns $ "+ ActualBouns);

        sc.close();
    }
}
