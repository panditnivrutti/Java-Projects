package array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
	public void reverse (int array[],int length)
	{  int temp=0;
	 int mid=length/2;
		for (int i=0;i<mid;i++)
		{
			 temp = array[i];
	        array[i] = array[length-i-1];
	        array[length-i-1] = temp;
		}
		System.out.println("After Reverse  : "+Arrays.toString(array));
	}

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter size of array : ");
     int length=s.nextInt();
     
     int array []=new int [length];
     System.out.println("Enter array elements : ");
     for(int i=0;i<array.length;i++)
     {
    	 array[i]=s.nextInt();
     }
     System.out.println("Before Reversing : "+Arrays.toString(array));
    Reverse r=new Reverse();
     r.reverse(array, length);
	}


}
