import java.util.Scanner;

public class SumInput {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();

        System.out.println("enter second number");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("sum of two number is");
        System.out.println(sum);

        sc.close();
    }

}