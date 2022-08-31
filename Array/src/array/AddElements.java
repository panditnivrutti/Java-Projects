package array;

import java.util.Arrays;
import java.util.Scanner;

public class AddElements {
	
	public void reverseArray(int size,int array[])
	
	{
		for (int i=size-1;i>=0;i--)
		{
			System.out.print(+array[i]+", ");
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=s.nextInt();
		
		int array[]=new int [size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++)
		{
			 array[i]=s.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		
		AddElements a=new AddElements();
		System.out.print("Reverse array : ");
		a.reverseArray(size, array);
		
	}

}
