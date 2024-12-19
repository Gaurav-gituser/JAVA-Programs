
import java.util.Scanner;

public class EvenOdd {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number To Check Number Is Even or Odd : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {

            System.out.println(+num + " Is Even Number");

        }

        else {

            System.out.println(+num + " Is Odd Number ");

        }

        sc.close();

    }
}