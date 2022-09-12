package stringMethods;

import java.util.Scanner;

public class FindWord {
 public static void main(String[] args) {
			Scanner s=new Scanner(System.in).useDelimiter("\n");
			System.out.println("Enter a Sentence ..");
		    String line = s.next();
		  String str []=line.split(" ");
		  
		 System.out.println("Enter a word to find in String ");
		 String word=s.next();
		    int count = 0;
		    for (int i = 0; i < str.length; i++)
		    {
		    if (word.equals(str[i]))
		        count++;
		    }
		 
		   System.out.println(word+ " is occured : "+count+"times ");
		
		    }
		   
		

}
