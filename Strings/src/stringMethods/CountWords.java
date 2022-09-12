package stringMethods;

public class CountWords {
	public static void countWords (String s1)
	{
		String arrs1[]=s1.split(" ");
		System.out.println("Total words in String : "+arrs1.length);
	     System.out.println("1st occurance : "+arrs1[0]);
	}

	public static void main(String[] args) {
   String s1 ="Java is a Programming Language";
   CountWords.countWords(s1);
	}

}
