package strings;

public class SplitString {
	void splitString(String str)
	{
		
		        String[] arrOfStr = str.split(":");
		        for (String a: arrOfStr) 
		        {
		            System.out.print(a+" ");
		        }
		}

	public static void main(String[] args) {
		String str="Hello:World";
		SplitString s =new SplitString();
		s.splitString(str);
		
	}
}
