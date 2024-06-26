package prog1;
import java.util.Scanner;

public class Week {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String day = obj.next();
        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println(day+ " is a weekend.");
        } else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                   day.equals("Thursday") || day.equals("Friday")) {
            System.out.println(day + " is a weekday.");
        } else {
            System.out.println("Invalid day entered. Please enter a valid day of the week.");
        }

       
    }
}
