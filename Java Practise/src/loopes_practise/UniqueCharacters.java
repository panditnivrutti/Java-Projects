package loopes_practise;

import java.util.Scanner;

public class UniqueCharacters {
	static void uniqueChar(String s1)
	{
	char [] arrs1= s1.toCharArray();
	for(int i=0;i<arrs1.length;i++)
	{   int count =0;
		for(int j=0;j<arrs1.length;j++)
		{
			if(arrs1[i]==arrs1[j])
			{
				count++;
			}
		}
			if(count==1)
			{
				System.out.print(arrs1[i]);
			}
	}
	
	}

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a string : ");
     String s1=s.next();
     uniqueChar(s1);
     
	}

}
