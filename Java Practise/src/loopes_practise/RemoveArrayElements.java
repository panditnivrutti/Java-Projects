package loopes_practise;

import java.util.Arrays;

public class RemoveArrayElements {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5,8,6};
	int arr2[]= {4,3,5,6,7,8,9,8};
	int length=arr1.length+arr2.length;
	int arr3[]=new int [length];
	  int i=0;
	for (int temp:arr1)
	{ 
		arr3[i]=temp;
		i++;
	}
	for (int temp:arr2)
	{ 
		arr3[i]=temp;
		i++;
	}
	
	for( i =0;i<arr3.length;i++)
	{  int count =0;
		for(int j=0;j<length;j++)
		{
			if(arr3[i]==arr3[j])
			{
		     	count++;
			}
			
		}
		if(count==1)
		{
			System.out.print(arr3[i]+" ");
		}
		
	}
	
	

}
}
