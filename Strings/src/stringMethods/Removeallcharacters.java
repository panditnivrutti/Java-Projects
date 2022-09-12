package stringMethods;

public class Removeallcharacters {
	static void replaceChar(String s1)
	{
	    char arrs1 []=s1.toCharArray();
	    for (int i=0;i<arrs1.length;i++)
	    {
	    	if(arrs1[i]=='a')
	    	{
	    		arrs1[i]='_';
	    	}
	    }
	    String s2=new String (arrs1);
	    System.out.println(arrs1);
	}

	public static void main(String[] args) {
   String s1="Java is a Programming language";
   Removeallcharacters.replaceChar(s1);
  
	}

}
