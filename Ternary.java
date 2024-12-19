import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Marks To Check You are pass or fail : ");
        int marks = sc.nextInt();

        // Ternary Operator

        String result = marks >= 35 ? "You Are Pass" : "You Are Fail";

        System.out.println(result);

        sc.close();

    }
}
