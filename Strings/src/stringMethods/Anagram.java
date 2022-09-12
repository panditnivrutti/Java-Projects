package stringMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static void anagram(String s1,String s2)
	{
		char arrs1[]=s1.toCharArray();
		char arrs2[]=s2.toCharArray();
		Arrays.sort(arrs1);
		Arrays.sort(arrs2);
		
		  int count=0 ; 
		if (arrs1.length==arrs2.length)
	      {
			for(int i=0;i<arrs1.length;i++)
			{
				if(arrs1[i]!=arrs2[i])
						{
					      break;
						}
				else
					count++;
			}
			if(count ==arrs1.length)
			{
				System.out.println("Given Strings are anagram");
			}
			else 
				System.out.println("Given Strings are not anagram ");
	      }
			
	      
		else
		{
		System.out.println("Given Strings are not Anagram ");
		}
		
}
		

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s1=s.next();
		
		System.out.println("Enter 2st String");
		String s2=s.next();
   Anagram.anagram(s1, s2);
	}

}
