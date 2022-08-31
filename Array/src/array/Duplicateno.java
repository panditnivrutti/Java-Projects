package array;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicateno {
	
	public void duplicateNumber(int array[],int size,int num)
	{  int count =0;
	System.out.print(num+" is present At Index Number : " );
		for(int i=0;i<size;i++)
		{
			if (array[i]==num)
			{
				count++;
				System.out.print( i+" " );
			}
		}
		System.out.println("and  is repeated " +count + " times.");
	}
	
	
	public void maxNumber(int array [],int size)
	{
		int secondMax=array[0];
		int maxNum =array[0];
		for (int i=0;i<size;i++)
		{   
			
			if(array[i]>maxNum)
			{
				maxNum=array[i];
			}
			
		}
		System.out.println("Maximum number in array is : "+maxNum);
        for (int i=0;i<size;i++)
        {
        	if (array[i]<maxNum&&array[i]>secondMax)
        	{
        		secondMax=array[i];
        	}
        }
        System.out.println("Second Maximum number in array is : "+secondMax);
	}
	
	
	
	public void minNumber(int array [],int size)
		{
			int minNum =array[0];
			for (int i=0;i<size;i++)
			{   
				
				if(array[i]<minNum)
				{
					minNum=array[i];
				}
				
			}
			System.out.println("Minimum number in array is : "+minNum);
	    }
		
		
  	public void average(int array[],int size)
		{    float sum=0;
		     float average=0;
			for (int i=0;i<size;i++)
			{
				sum=sum+array[i];
			}
			average=sum/size;
			System.out.println("Average of array elements : "+average);
		}
		
		
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       
       System.out.println("Enter Size of array : ");
       int size=s.nextInt();
       
       int [] array=new int [size]; 
       System.out.println("Enter arrry Elements : ");
        for (int i=0;i<size;i++)
        {
        	 array[i] =s.nextInt();
        }
        
       System.out.println(Arrays.toString(array));
       
       System.out.println("Enter a Number to check its Duplicate in array : ");
       int num=s.nextInt();
       
       Duplicateno d=new Duplicateno();
       d.duplicateNumber(array, size, num);
       d.maxNumber(array, size);
       d.minNumber(array, size);
       d.average(array, size);
	}

}
