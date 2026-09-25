import java.util.Scanner;
import java.time.LocalDate;

public class Employee {
    public static void main(String[] args) {
        Scanner EmployeeData = new Scanner(System.in);

        System.out.print("Enter  your  Employee Id :");
        String  Employeeid = EmployeeData.nextLine();

        System.out.print("Enter  your Name :");
        String Name = EmployeeData.nextLine();

        System.out.print("Enter your Department :");
        String Department = EmployeeData.nextLine();

        System.out.print("Enter joining date (YYYY-MM-DD) :");
        String DateInput = EmployeeData.nextLine();
        LocalDate date = LocalDate.parse(DateInput);

        System.out.println("        Employee Data        ");   
        System.out.println("Employeeid : " + Employeeid);
        System.out.println("Name :" + Name);
        System.out.println("Department :" + Department);
        System.out.println("Date :" + date);
    }
    
}