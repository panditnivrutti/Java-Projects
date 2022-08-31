package java_fundamental;

public class IncreamentDecreament {
public static void main(String[] args) {
	int a= 5 ; int b = 4 ; int c = 3 ;
	
	System.out.println(a++ + b * ++c); //a=6,b=4,c=4
	System.out.println("a = " + a + " b= " + b + " c = " + c);
	
	
	
	System.out.println(b*5/a + b++ + b);  //b=5,a=6
	                                   //5*5/6+6 = 
	System.out.println("a = " + a + " b= " + b + " c = " + c);		
	System.out.println(25/6);
}
}
