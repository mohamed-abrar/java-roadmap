import java.util.Scanner;

public class Packege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Java  Version :");
        String version = sc.nextLine();

        System.out.print("Application Name :");
        String name = sc.nextLine();

        System.out.println("Installed  java version :" + version);
        System.out.println("Application Name :" +  name);
        System.out.println("Successfull verification  message");
    }
}
