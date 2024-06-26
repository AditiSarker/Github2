package prog1;
import java.util.*;
public class If {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your age:");
		int age = obj.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
			
		}
		System.out.print("Enter a number:");
		int number =obj.nextInt();
		if(number % 2 ==0) {
			System.out.println("This is even number:");
		}
		else {
			System.out.println("this is odd number");
			
			
		}
	}

}

