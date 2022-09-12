package stringMethods;

import java.util.Arrays;
import java.util.Scanner;


public class ConvertUppar {

	void upparcase(char character,char ch[])
	{
	 for (int i=0;i<ch.length;i++)
	   {
		  
		   if(ch[i]==character&&(ch[i]>'A'))
		   {
			   ch[i]=(char)(ch[i]-32);
			  
		   }   
	   }
	 String s1=new String(ch);
	 System.out.println(s1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Sentence ..");
	    String line = s.nextLine();
	    System.out.println("Enter a character to find in sentence :");
	    char character =s.next().charAt(0);
	    char ch[]=line.toCharArray();
	  
	ConvertUppar con=new ConvertUppar();
	con.upparcase(character, ch);
	}

}
