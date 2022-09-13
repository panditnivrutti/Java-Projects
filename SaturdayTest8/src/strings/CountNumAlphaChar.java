package strings;

import java.util.Scanner;

public class CountNumAlphaChar {
static void count (String s1)
{
    char ch[]=s1.toCharArray();
    int num=0;
    int alpha=0;
    int spec=0;
    for (int i=0;i<ch.length;i++)
    {   
	    	if((ch[i]>='A'&&ch[i]<='Z') || (ch[i]>='a'&&ch[i]<='z'))
	    	{
	    		alpha++;
	    	}
    	    else if (ch[i]>='0'&&ch[i]<='9')
    	    {
    	    	num++;
    	    }
    	    else
    	    {
    	    	spec++;
    	    }
    }
    System.out.println("Alphabets : "+alpha+"\nNumbers : "+num+"\nSpecial Characters : "+spec);
}
	public static void main(String[] args) {
   Scanner s=new Scanner (System.in);
   System.out.println("Enter String ");
   String s1 =s.next();
   CountNumAlphaChar.count(s1);
	}

}
