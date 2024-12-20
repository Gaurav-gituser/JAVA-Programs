import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter Which Operation You Want To Perform : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addition Of " + a + " and " + b + " Is " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction Of " + a + " and " + b + " Is " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication Of " + a + " and " + b + " Is " + (a * b));
                break;
            case '/':
                System.out.println("Division Of " + a + " and " + b + " Is " + (a / b));
                break;

            default:
                System.out.print("Entered Operation Is Invalid Enter '+','-','/','*' Any Of These");

        }

        sc.close();

    }

}
