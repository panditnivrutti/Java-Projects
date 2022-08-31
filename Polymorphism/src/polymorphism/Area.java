package polymorphism;

import java.util.Scanner;

public class Area {
	void area(int a)
	{
		System.out.println("Area of square = "+(a*a));
	}
	
	void area(float pie,float rad)
	{
		System.out.println("Area of square = "+(pie*rad*rad));
	}
	
	void area(int width,float length)
	{
		System.out.println("Area of square = "+(width*length));
	}

	void area(float half,int base,int height)
	{
		System.out.println("Area of square = "+(half*base*height));
	}
     public static void main(String[] args) {
		
		Area ar=new Area();
		ar.area(12);
		ar.area(3.14f, 13.00f);
		ar.area(15, 15.0f);
		ar.area(0.5f, 13, 15);
		
	}
}
