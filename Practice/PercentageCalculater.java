package Practice;
import java.util.Scanner;
public class PercentageCalculater {

	public static void main(String[] args) {
		
		System.out.println("Enter your subjects marks and will get your percentage!!");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of 1 subject:");
		int a = sc.nextInt();
		System.out.println("Enter the nubers of 2 subject:");
		int b = sc.nextInt();
		System.out.println("Enter the nubers of 3 subject:");
		int c = sc.nextInt();
		System.out.println("Enter the nubers of 4 subject:");
		int d = sc.nextInt();
		System.out.println("Enter the nubers of 5 subject:");
		int e = sc.nextInt();
		int f=a+b+c+d+e;
		int P = (f*100)/500;
		System.out.print("So the percentage you get in you exam subjects:");
		System.out.println(P);
				
		
		
		
	}

}
