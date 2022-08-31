package array;

import java.util.Arrays;

public class ReplaceNumber {
	
	void NegativeNumber(int arr[],int size)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			
			if (arr[i]<0)
			{
				count++;
			}	
		}
		System.out.println("Totall negative elements : "+count);
	}
	
	void ReplaceNegativeNumber(int arr[],int size)
	{  
		
		for(int i=0;i<size;i++)
		{
			
			if (arr[i]<0)
			{
				arr[i]=arr [i-1]*arr[i-1];
				
			}
				
		}
		System.out.print("Array after replacing Negative Numbers :"+Arrays.toString(arr));
		
	}
	void Display(int arr[],int size)
	{
		System.out.println("Array Before replacing Negative Numbers :"+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int arr[]= {8,-10,54,-6,4,-3,7,2,-4};
		
		ReplaceNumber n=new ReplaceNumber();
		n.NegativeNumber(arr, 9);
		n.Display(arr, 9);
		n.ReplaceNegativeNumber(arr, 9);
	}

}
