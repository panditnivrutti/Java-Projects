package saturday_test;

import java.util.Scanner;

public class Box {
	void volume(float length,float width,float height)
	{
		System.out.println("Volume = "+(length*width*height));
	}
 
	public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println("Enter Lenght,Width,and Height :");
    float length=s.nextFloat();
    float width=s.nextFloat();
    float height=s.nextFloat();
    Box b=new Box();
    b.volume(length, width, height);
	}

}
