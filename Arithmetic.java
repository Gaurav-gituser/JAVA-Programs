import java.util.*;

public class Arithmetic {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("Addition is : " + (a + b));
        System.out.println("Subtraction is : " + (a - b));
        System.out.println("Multiplication is : " + (a * b));
        System.out.println("Division is : " + (a / b));
        System.out.println("Modulo is : " + (a % b));

        sc.close();

    }
}