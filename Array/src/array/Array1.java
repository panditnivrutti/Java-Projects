package array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=s.nextInt();
		 int []arr=new int [size];
		System.out.println("Enter arry elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int sum=0;
		int sum1=0;
		for(int i=0;i<size;i++)
		{
			
			if (arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
			else 
				sum1=sum1+arr[i];
		}
		System.out.println("sum of even numbers is : "+sum);
		System.out.println("sum of odd numbers is : "+sum1);
	}

}
