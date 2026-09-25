import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary :");
        double Salary  = sc.nextDouble();

        System.out.print("enter allowance :");
        double Allowances  = sc.nextDouble();

        double professinalTax = 3 % Salary;
        double incomeTax = 8 % Salary;

        double GrossSalary = (Salary + Allowances);
        System.out.println("GrossSalary :"  +  GrossSalary);

        double Netsalary =  (GrossSalary -(professinalTax  + incomeTax));
        System.out.println("Net Salary :"  + Netsalary);
        
    }
}
