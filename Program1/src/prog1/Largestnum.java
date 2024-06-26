package prog1;
import java.util.*;

public class Largestnum {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter first number: ");
        a = obj.nextInt();
        System.out.print("Enter second number: ");
        b = obj.nextInt();
        System.out.print("Enter third number: ");
        c = obj.nextInt();
        
        if (a >= b && a >= c) {
            System.out.println("a is the largest number");
        } else if (b >= a && b >= c) {
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }

        obj.close();
    }
}

