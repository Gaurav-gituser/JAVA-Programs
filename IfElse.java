import java.util.Scanner;

public class IfElse {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age To Identify You Are Adult or Not : ");

        int age = sc.nextInt();

        if (age >= 18) {

            System.out.print("Yes,You Are Adult  ");

        }

        else {

            System.out.print("No,You Are Not Adult  ");

        }

        sc.close();

    }

}
