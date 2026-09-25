import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class SetupDetails {
    public static void main(String[] args) {
        Scanner SetUp = new Scanner(System.in);

        System.out.print("Enter branch name :");
        String BranchName = SetUp.nextLine();

        System.out.print("Enter City :");
        String City = SetUp.nextLine();

        System.out.print("Enter Opening time (HH:mm):");
        String timeInput = SetUp.nextLine();
        LocalTime time = LocalTime.parse(timeInput);

        System.out.println("        *Branch Data*        ");
        System.out.println("BranchName  : " + BranchName);
        System.out.println("City        :  "+City);
        System.out.println("Opening Time:"+timeInput);
    }

}
