package array;

import java.util.Arrays;
import java.util.Scanner;

public class Alternate {
	public void alternate(int array[],int length)
	{  int temp=0;
		for (int i=1;i<length;i++)
		{
			 temp = array[i];
	        array[i] = array[i-1];
	        array[i-1] = temp;
		}
		System.out.println("After alternating  : "+Arrays.toString(array));
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
     System.out.println("Before Alternating : "+Arrays.toString(array));
     Alternate r=new Alternate();
     r.alternate(array, length);
	}

}


