package strings;

import java.util.Scanner;

public class RemoveWords {
	static void removeWords(String s1)
	{ 
		String substr=s1.toLowerCase();
		
		char arrsubstr[]=substr.toCharArray();
		System.out.println("Before Removing words : "+substr);
		System.out.print("after removing words  : ");
		
		for(char substring :arrsubstr)
	        	{if(substring>='a'&& substring<='z')
			      {substring='*';}
			    	  System.out.print(substring);
			      
		        }
	}

	public static void main(String[] args) {
   Scanner s=new Scanner (System.in);
   System.out.println("Enter a Sentence ");
    String s1=s.nextLine();
    RemoveWords.removeWords(s1);
    
	}

}
