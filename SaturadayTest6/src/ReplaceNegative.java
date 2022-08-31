import java.util.Arrays;
import java.util.Scanner;


public class ReplaceNegative {
	public void replaceNegative(int size,int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			if ( array[i]<0)
			{
				array[i]=array[i-1]*array[i-1];
			}
		}
		System.out.println("After replacing Neagative Values : "+Arrays.toString(array));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array ");
		int size=s.nextInt();
		int array[]=new int [size];
		System.out.println("Enter the array elements : ");
		{
			for(int i=0;i<array.length;i++)
			{
				array[i]=s.nextInt();
			}
		}
		ReplaceNegative r=new ReplaceNegative();
		System.out.println("Before replace negative values : "+Arrays.toString(array));
		r.replaceNegative(size, array);
	}

}
