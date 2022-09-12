package stringMethods;

public class StringMEthods {
	public static void main(String[] args) {
		String s1="Java";
		String s2="Language";
		String s3="java";
		String s4=new String ("Java");
		System.out.println("Character at 1 index : "+s2.charAt(1));
		
		System.out.println("Concat method : "+s1.concat(s2));
		System.out.println(s2.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println("Index of v : "+s2.indexOf('e'));
		System.out.println("Index Of Lang : "+s2.indexOf("ang"));
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s2.replace("lang", "LANG"));
		System.out.println(s2.substring(2));
		System.out.println(s2.subSequence(2, 6));
		System.out.println(s2.equals("Language"));
		System.out.println(s2.equalsIgnoreCase("LANGUAGE"));
		
	}

}
