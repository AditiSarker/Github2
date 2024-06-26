package prog1;
import java.util.*;

public class Grade {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int score;
        
        System.out.print("Enter the score: ");
        score = obj.nextInt();
        
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade: D");
        } else if (score >= 0 && score < 60) {
            System.out.println("Grade: F");
       
        }

       
    }
}