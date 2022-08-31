package aug02;

import java.util.Scanner;

public class Percentage {
	float totall(float m1,float m2,float m3,float m4,float m5)
	{
		float totall=m1+m2+m3+m4+m5;
		return totall;
	}
	float percent(float totall)
	{
		float percent=totall/5;
		System.out.println(percent);
		return percent;
	}
	void grade(float totall)
	{
    	if	(percent(totall)>75);
		{
			System.out.println("Distinction");
		}
		
	}
public static void main(String[] args) {
	Percentage p=new Percentage();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter marks of Five Subjects : ");
	float m1=s.nextFloat(); 
	float m2=s.nextFloat();
	float m3=s.nextFloat();
	float m4=s.nextFloat();
	float m5=s.nextFloat();
	float totall=p.totall(m1, m2, m3, m4, m5);
   // float percent=p.percent(totall);
         p.grade(totall);
	
}
}
