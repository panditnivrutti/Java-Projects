import java.util.Scanner;

public class MinChar {
	public void minChar(int size,char array[])
	{   char min=array[0];
		for (int i=0;i<array.length;i++)
		{
			
			if(array[i]<array[0])
			{
				min=array[i];
			}
		
		}
		System.out.println("Minimum character is : "+min);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array ");
		int size=s.nextInt();
		char array[]=new char [size];
		System.out.println("Enter the characters");
		{
			for(int i=0;i<array.length;i++)
			{
				array[i]=s.next().charAt(0);
			}
		}
		
		MinChar m=new MinChar();
		m.minChar(size, array);
		
	}

}
