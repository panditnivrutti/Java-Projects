package java_fundamental;

import java.util.Scanner;

public class Circle {
	public static void main(String []args){ 
	float rad;      //for radius
	float dia;      //for diameter
	float circ;     //for circumference
	String unit;    // for unit
	System.out.println("Enter radious to find diameter and circumference of circle");
	
	Scanner s=new Scanner(System.in);
	rad=s.nextFloat();
	System.out.println("enter unit('cm'/'m')");
	unit=s.next();
    dia=2*rad;
	circ=2*3.14f*rad;
	System.out.println("Diameter of circle is :" +dia+" "+unit);
	System.out.println("circumference of circle is :" +circ+" "+unit);		
	
	
	
	
	
	}
}
