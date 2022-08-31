package java_fundamental;

import java.util.Scanner;

public class EquilateralTriangle {
public static void main(String[] args) {
	float side,area;
	System.out.println("Enter side of equilateral triangle");
	Scanner s=new Scanner (System.in);
	side=s.nextFloat();
	area= (1.73f*side*side)/4;
	System.out.println("Area of equilateral triangle is =" +area);
}  
}
