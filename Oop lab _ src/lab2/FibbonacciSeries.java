package lab2;
import java.util.Scanner;
public class FibbonacciSeries {

	public static void main(String[] args) {
		
		
				System.out.print("Enter the numbers of array elements:");
				Scanner sc=new Scanner(System.in);
				int n= sc.nextInt();
				System.out.println("So the fibbonacci Series of 10 elements of array is:");
				int a=1;
				int b=2;
				int c=0;
				System.out.println(a+" ");
				System.out.println(b+" ");
				for (int i=0;i<n-2;++i) {
					c=a+b;
					System.out.println(c+" ");
					a=b;
					b=c;
				}
			

		}


}
