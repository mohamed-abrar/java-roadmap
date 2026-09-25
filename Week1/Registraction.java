import java.util.Scanner;

public class Registraction {
    public static void main(String[] args) {
        Scanner PatientReg = new Scanner(System.in);

        System.out.print("Enter Patient name :");
        String PatientName = PatientReg.nextLine();

        System.out.print("Enter Age :");
        String Age = PatientReg.nextLine();

        System.out.print("Enter Contact Number :");
        String Phone = PatientReg.nextLine();

        System.out.println("        Patient Registration Data        ");
        System.out.println("Patient Name: " + PatientName);
        System.out.println("Age :" + Age);
        System.out.println("Contact number :" + Phone);

    }
}
