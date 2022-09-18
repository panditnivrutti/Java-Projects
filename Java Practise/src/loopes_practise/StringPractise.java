package loopes_practise;

import java.util.Scanner;

public class StringPractise {
	static void seperateChar(String s1)
	{
		int sum=0;
		char arrs1[]=s1.toCharArray();
		for(int i=0;i<arrs1.length;i++)
		{   
			
			
			 if(arrs1[i]>='0' &&arrs1[i]<='9')
			{  
				System.out.print(arrs1[i]);
				sum=sum+(arrs1[i]-48);
				
			}
		}
		System.out.println();
		System.out.println("Sum of integers : "+sum);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string with alphabets and numbers");
		String s1=s.next();
		seperateChar(s1);	
		
	}

}
