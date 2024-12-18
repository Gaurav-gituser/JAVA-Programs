import java.util.*;

public class ArCircle {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius");
        float radius = sc.nextFloat();

        float area = 3.14f * radius * radius;

        System.out.println("Area of circle is : ");
        System.out.println(area);

        sc.close();

    }

}