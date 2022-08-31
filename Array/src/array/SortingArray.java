package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
	
	public void sortArray(int array[],int length)
	{
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter array length : ");
      int length=s.nextInt();
      int array[]=new int [length];
      System.out.println("enter array elements : ");
      for(int i=0;i<length;i++)
      {
    	   array[i]=s.nextInt();
      }
      
      SortingArray sa =new SortingArray();
      sa.sortArray(array, length);
	}

}
