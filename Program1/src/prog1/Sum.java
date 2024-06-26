package prog1;

public class Sum {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 5) {
            int square = i * i;
            System.out.println(i + "^2 = " + square);
            sum = sum + square;
            i++;
        }

        System.out.println("Sum value " + sum);
    }
}