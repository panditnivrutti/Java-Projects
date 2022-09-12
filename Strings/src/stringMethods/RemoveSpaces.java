package stringMethods;

public class RemoveSpaces {
	void removespaces(String str)
	{
		
		        String str2 = str.replace(" ", "");
		       
		            System.out.print(str2);
	}

	
 
	public static void main(String[] args) {
			String str="Java Is a Programming Language";
			RemoveSpaces r =new RemoveSpaces();
			r.removespaces(str);
	}

}
