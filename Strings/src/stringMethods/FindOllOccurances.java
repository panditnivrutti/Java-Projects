package stringMethods;

public class FindOllOccurances {
	public static void countWords (String s1)
	{
		String arrs1[]=s1.split(" ");
		for(int i=0;i<arrs1.length;i++)
		{
		  System.out.println(i+1 +" occurance : " +arrs1[i]);	
		}
	   
	}
	public static void main(String[] args) {
		
	   String s1 ="Java is a Programming Language";
	   FindOllOccurances.countWords(s1);
		}

}
