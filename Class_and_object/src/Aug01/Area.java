package Aug01;

import java.util.Scanner;

public class Area {
	void rect(int l,int w)
	{
		System.out.println("Area of Rectangle : "+(l*w));
	}
	void circle(float r,float p)
	{
		System.out.println("Area of circle ; "+(p*r*r));
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Area a=new Area();
	System.out.println("1.Area of Rectangle");
	System.out.println("2.Area of circle");
	System.out.println("Enter Your choice");
	int ch=s.nextInt();
	switch(ch)
	{
	case 1: System.out.println("Enter Length and  width");
	
	       int l=s.nextInt();
	       int w=s.nextInt();
	       a.rect(l, w);
	           break;
	case 2: System.out.println("Enter Radious");
	
	        float r=s.nextFloat();
	        float p=3.14f;
	        a.circle(r, p);
	            break;
	default: System.out.println("Invalid input");
	}
}
}
