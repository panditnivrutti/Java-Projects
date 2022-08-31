package aug02;

import java.util.Scanner;

public class SimpleInterest {
float cal(float p,float r,float t)
{
  float cal=p*r*t;
  return cal;
}
void si(float cal)
{
   float si=cal/100;
   System.out.println("Simple Interst : "+si);
}
public static void main(String[] args) {
	SimpleInterest s=new SimpleInterest();
	Scanner sc=new Scanner(System.in);
	System.out.println(" To calculate SI Enter P,R,T :");
    float p=sc.nextFloat();
    float r=sc.nextFloat();
    float t=sc.nextFloat();
      float cal =s.cal(p, r, t);
      s.si(cal);

}
}
