import java.util.Scanner;

public class LargestNum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        if (a > b) {

            System.out.println("Largest Number is : " + a);

        }

        else {

            System.out.println("Largest Number is : " + b);

        }

        sc.close();
    }

}
