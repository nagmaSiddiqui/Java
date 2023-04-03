package dsa_java;

import java.util.Scanner;

public class InsertionInArray {

	public static void main(String[] args) {
		
		int n,m,x;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the size of array:");
		n=s.nextInt();
		int a[]= new int[n];
		int b[]= new int[n+1];
		System.out.println("Enter values:");
		for(int i=0;i<n;i++) {
			
			a[i]=s.nextInt();
			
		}
		System.out.println("Enter the index of value to be inserted:");
		m=s.nextInt();
		System.out.println("Enter the values for insertion:");
		x=s.nextInt();
		for(int i=0;i<n+1;i++) {
			if(i<m) {
				b[i]=a[i];
			}
			else if(i==m) {
				b[i]=x;
				
			}
			else {
				b[i]=a[i-1];
			}
		}
		
		
		System.out.println("Array is:");
		for(int i=0;i<n+1;i++) {
			System.out.println(b[i]);
			
		}
	}

}
