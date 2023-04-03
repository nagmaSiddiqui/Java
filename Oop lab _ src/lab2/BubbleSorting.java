package lab2;
import java.util.Scanner;
public class BubbleSorting {

	public static void main(String[] args) {
        System.out.print("Enter the elements in array:");
        Scanner sc=new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
            int arr[]= new int[n];
            int i,j;
            //arr.length= n;
            for(i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int t;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        t=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=t;
                    }
                }
            }
            System.out.println(" The sorted Array is : ");
            for(i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
	}
}
