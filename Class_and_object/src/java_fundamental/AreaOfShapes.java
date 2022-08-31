package java_fundamental;

import java.util.Scanner;

public class AreaOfShapes {
public static void main(String[] args) {
	System.out.println("Enter your Choice to find Area :");
	Scanner s=new Scanner (System.in);
	float area;
	int ch=s.nextInt();
	System.out.println("Enter 1 for area of Circle");
	System.out.println("Enter 2 for area of Rectangle");
	System.out.println("Enter 3 for area of Traingle");
	System.out.println("Enter 4 for area of Square");
	switch(ch)
	{
	   case 1: System.out.println("Enter Radious of circle");
	    float rad=s.nextFloat();
	    area=3.14f*rad*rad;
	    		System.out.println("Area of Circle: " +area);
	           break;
	           
	   case 2: System.out.println("Enter length");
	   float length=s.nextFloat();
	   System.out.println("Enter breath");
	   float bre=s.nextFloat();
	   area=length*bre;
	   System.out.println("Area of Rectangle: " +area);
	           break;
	           
	   case 3: System.out.println("Enter Base");
	   float base=s.nextFloat();
	   System.out.println("Enter Height");
	   float height=s.nextFloat();
	   area=0.5f*base*height;
	   System.out.println("Area of Triangle: " +area);
	           break;
	          
	   case 4: System.out.println("Enter a side of Square");
	   float side=s.nextFloat();
	   area=side*side;
	   System.out.println("Area of Square: " +area);
	}
}
}
