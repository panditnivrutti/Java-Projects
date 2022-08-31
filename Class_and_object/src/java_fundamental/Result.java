package java_fundamental;

import java.util.Scanner;

public class Result {
public static void main(String[] args) {
	
	int math,eng,phy,chem,bio,avrg;
	float percent;
	String name ;
	System.out.println("Enter your name");
	Scanner s=new Scanner(System.in);
	     name=s.next();

	System.out.println("hello "+name+ "Enter your marks of ");
	  
	       
	System.out.println("Math,English,Chysics");
    System.out.println("Chemistry,Biology respectively");
    
    
    math=s.nextInt();
    eng=s.nextInt();
    phy=s.nextInt();
    chem=s.nextInt();
    bio=s.nextInt();
    avrg=(math+eng+phy+chem+bio)/5;
    percent=avrg;
    System.out.println(avrg);
    if (percent>85)
    {
     System.out.println("Congrats..."+name+" you have got" +percent+"% and passed with 'A+' grade..");
    }
          else if(percent>75&&percent<85)
          {
        	  System.out.println("Congrats..."+name+" you have got" +percent+"% and passed with 'A' grade..");
          }
          else if(percent>65&&percent<75)
          {
        	  System.out.println("Congrats..."+name+" you have got" +percent+"% and passed with 'B' grade..");
          }
          else if(percent>55&&percent<65)	
          {
        	  System.out.println("Congrats..."+name+" you have got" +percent+"% and passed with 'C' grade..");
          }	
          else if(percent>45&&percent<55)
          {
        	  System.out.println("Congrats..."+name+" you have got" +percent+"% and passed with 'D' grade..");
          }
          else if(percent>35&&percent<45)
          {
        	  System.out.println("Heyy"+name+" you have got" +percent+"% and you are just passed somehow");
          }
          else
          {
        	  System.out.println("hii "+name+" you have got" +percent+"% and you have FAILED better luck next time");
          }  
        	  
}
}
