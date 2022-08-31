package array;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArray {
	
	public void equalTest(int length1,int length2,int array1[],int array2[])
	{  int count=0 ; 
	if (array1.length==array2.length)
      {
		for (int i=0;i<array1.length;i++)
		{
  	       	if(array1[i]==array2[i])
				{
					count++;
				} 
  	       	else
  	       		System.out.println("Given elements of  arrays are not Identicle");
  	       	        break;
		 }
		
			if(count==array1.length)
			System.out.println("Given array have same elements ");
      }
			else
			System.out.println("Given arrays have different lengths ");
	}
	



	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter size of 1st arrays");
     int length1 =s.nextInt();
     int array1[]=new int [length1];
     System.out.println("Enter elements of first array : ");
     for(int i=0;i<length1;i++)
     {
    	 array1[i]=s.nextInt();
     }
     System.out.println("Enter size of 1st arrays");
     int length2 =s.nextInt();
     System.out.println("Enter elements of Second array : ");
     int array2[]=new int [length2];
     for(int i=0;i<length2;i++)
     {
    	 array2[i]=s.nextInt();
     }
     System.out.println("Array 1 : "+Arrays.toString(array1));
     System.out.println("Array 2 : "+Arrays.toString(array2));
     EqualArray eq=new EqualArray();
     eq.equalTest(length1, length2, array1, array2);
	}

}
