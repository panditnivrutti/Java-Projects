package stringMethods;

import java.util.Arrays;
import java.util.Scanner;

public class ShortName {
	static void shortname (String s1,String s2,String s3)
	{ char [] ars1 =s1.toCharArray();
	  char [] ars2 =s2.toCharArray();
	  
	   System.out.print(ars1[0]+"."+ars2[0]+"."+s3);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter First Name ");
		String s1=s.next();
		
		System.out.println("Enter Middle Name ");
		String s2=s.next();
		
		System.out.println("Enter Last Name ");
		String s3=s.next();
		ShortName.shortname(s1, s2, s3);
	}

}
