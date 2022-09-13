package string_buffer;

public class StringbufferExample {
 public static void main(String[] args) {
	StringBuffer sbf=new StringBuffer("Java");
	System.out.println(sbf);
	sbf.append("Core");
	System.out.println("After appending : "+sbf );
	System.out.println(sbf.capacity());
	System.out.println(sbf.length());
	sbf.ensureCapacity(32);
	System.out.println("after ensuring capacity : "+sbf.capacity());
	System.out.println(sbf.deleteCharAt(1));
	System.out.println(sbf);
}
}
