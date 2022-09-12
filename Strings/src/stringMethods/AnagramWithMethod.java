package stringMethods;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramWithMethod {
		static void anagram(String s1,String s2)
		{
			char arrs1[]=s1.toCharArray();
			char arrs2[]=s2.toCharArray();
			Arrays.sort(arrs1);
			Arrays.sort(arrs2);
			
			if(arrs1.equals(arrs2))
			{
				System.out.println("Strings are anagram");	
			}
			else
				System.out.println("Strings are Not anagram");
			
			
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



