package Mobile;
import java.util.Scanner;

public class MobileMain {
    public static void main(String[] args) {
        Mobile M1 = new Mobile();
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Choose your color:
                -Black
                -Red
                -White
                -Blue
                """);
        String  color = input.nextLine();
        System.out.println("""
                Select Your Model Brand
                -Iphone
                -Samsung
                -Nokia
                -MI
                -1+""");
        String type = input.nextLine();
        System.out.println("""
                Choose Price Range:
                -Rs.5000 - Rs.10000
                -Rs.1000 - Rs.20000
                -Above 20000
                """);
        int price = input.nextInt();


        System.out.println("Selected Color"+color);
        System.out.println("Selected Price Range"+price);
        System.out.println("Selected Mobile Brand"+type);

        M1.Feature();
    }
}
