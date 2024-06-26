package prog1;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter initial value: ");
        int a = obj.nextInt();

        System.out.print("Enter last value: ");
        int b = obj.nextInt();

        for (int i = a; i <= b; i++) {
           
            if (i % 2 == 0) 
          {
          continue;
            }
            else
            {
            	System.out.println(i);
            }
        }

        obj.close();
    }
}
