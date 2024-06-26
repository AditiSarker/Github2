package prog1;
import java.util.*;
public class Class3 {

    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
        sc.close();
    }

}