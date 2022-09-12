package stringMethods;

import java.util.Scanner;

public class OccuranceOfChar {
	public void OccuranceOfChar(String s1)
	{
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{    int cnt=1;
		     char c =ch[i];
			for (int j=i+1;j<ch.length;j++)
			{
				if(ch[j]==c)
				{
					cnt++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0')
			{
				System.out.println(c+ " : "+cnt);
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=s.nextLine();
		OccuranceOfChar oc=new OccuranceOfChar();
		oc.OccuranceOfChar(s1);
	}

}
