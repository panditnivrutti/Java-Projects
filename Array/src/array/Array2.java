package array;

import java.util.Scanner;

public class Array2 {
	void SumOfArray(int arr[],int size)
	{
		int sum=0;
		for(int i=0;i<size;i++)
		{
			
			
				sum=sum+arr[i];
		
		}
		System.out.println("sum of even numbers is : "+sum);	
	}
	
	public void DisplayArray(int arr[],int size)
	{
		{
		for (int a:arr)
			System.out.println(a+" ");
		}
		
	}


	 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=s.nextInt();
		 int []arr=new int [size];
		System.out.print("Enter arry elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
     Array2 a=new Array2();
     a.SumOfArray(arr, size);
     a.DisplayArray(arr, size);
}
}
