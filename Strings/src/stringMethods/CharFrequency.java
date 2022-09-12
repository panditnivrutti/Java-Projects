package stringMethods;

import java.util.Scanner;

public class CharFrequency {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Sentence ..");
	    String line = s.nextLine();
	    System.out.println("Enter a character to find in sentence :");
	    char character =s.next().charAt(0);
	    char ch[]=line.toCharArray();
	   int  count =0;
	   System.out.print(character +"is present at index number : ");
	for(int i=0;i<ch.length;i++)
		
	{
		if(ch[i]==character)
		{
			count++;
		System.out.print(i+" ");
		}
	}
	System.out.println("and it occured "+count+ " times ");

	}
}
