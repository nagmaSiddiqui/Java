package dsa_java;

import java.util.Scanner;

public class UserDefinedArray {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the size of array:");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter values:");
		for(int i=0;i<n;i++) {
			
			a[i]=s.nextInt();
			
		}
		
		System.out.println("Array is:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
			
		}
		
	}

}
