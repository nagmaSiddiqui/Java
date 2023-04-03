package Practice;
import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first:");
		 int a= sc.nextInt();
		 System.out.println("Enter second:");
		 int b= sc.nextInt();
		  int c= a+b;
		  System.out.println("The diff of first and second value");
		 System.out.println(c);

	}

}
