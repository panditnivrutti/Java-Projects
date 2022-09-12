package stringMethods;

public class String1 {
	public static void main(String[] args) {
		String s1=new String("Java");
		String s2=("Java");
		String s3="Java";
		
		System.out.println(s1==s2);
     	System.out.println(s2==s3);
     	System.out.println(s2.equals(s3));
	}
	

}
