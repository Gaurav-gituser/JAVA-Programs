import java.util.Scanner;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first boolean value (true/false): ");
        boolean condition1 = sc.nextBoolean();

        System.out.println("Enter the second boolean value (true/false): ");
        boolean condition2 = sc.nextBoolean();

        // Logical operations
        System.out.println("Logical Operations:");
        System.out.println("condition1 && condition2 : " + (condition1 && condition2)); // AND
        System.out.println("condition1 || condition2 : " + (condition1 || condition2)); // OR
        System.out.println("!condition1 : " + (!condition1));                           // NOT

        sc.close();
    }
}
