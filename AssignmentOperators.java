public class AssignmentOperators {

    public static void main(String args[]) {
        // Declare and initialize variables
        int a = 10;
        int b = 20;
        
        // Basic assignment operator (=)
        System.out.println("Initial value of a: " + a);
        System.out.println("Initial value of b: " + b);

        // Compound assignment operators
        a += 5; // Equivalent to a = a + 5
        System.out.println("After a += 5, a: " + a);

        b -= 10; // Equivalent to b = b - 10
        System.out.println("After b -= 10, b: " + b);

        a *= 2; // Equivalent to a = a * 2
        System.out.println("After a *= 2, a: " + a);

        b /= 2; // Equivalent to b = b / 2
        System.out.println("After b /= 2, b: " + b);

        a %= 3; // Equivalent to a = a % 3
        System.out.println("After a %= 3, a: " + a);
    }
}
