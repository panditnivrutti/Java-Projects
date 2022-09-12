package stringMethods;

import java.util.Scanner;

public class Remove1stanLast {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter a Sentence ..");
	    String line = s.next();
	  String str []=line.split(" ");
	    
	    for (int i = 1; i < str.length-1; i++)
	    {
	    	 System.out.print(str[i]+" ");
	    }
	 
	  
	
	    }

}
