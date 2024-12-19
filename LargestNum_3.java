import java.util.Scanner;

public class LargestNum_3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        if ((a >= b) && (a >= c)) {

            System.out.println("Largest Number is : " + a);

        }

        else if (b >= c) {

            System.out.println("Largest Number is : " + b);

        }

        else {

            System.out.println("Largest Number is : " + c);

        }

        sc.close();
    }

}
