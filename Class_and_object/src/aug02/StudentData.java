package aug02;

import java.util.Scanner;

public class StudentData {
	String name;
	String dept;
	int id;
	int marks;
	String grade;
	float percent;
	
	int totall(int m1,int m2,int m3,int m4,int m5)
	{
		int totall=m1+m2+m3+m4+m5;
		return totall;
	}
	float percent(int totall)
	{
		float percent=totall/5;
		return percent;
	}
	String grade(float percent)
	{
	    if( percent>=75)
	    	grade ="Distinction";
	    
	    else if( percent>=60&&percent<75)
	    	grade ="A Grade";
	    
	    else if( percent>=50&&percent<60)
	    	grade ="B Grade";
	    
	    else if( percent>=35&&percent<50)
	    	grade ="c Grade";
	    else 
	    {
	    	grade ="FAIL";
	    }
	    return grade;
	}
	   
	void setData(String n,int i,String d,float p,String g)
	{
		name=n; id=i;dept=d;  percent = p; grade=g;
    }
	 void display()
	  {
		  System.out.println("Name : "+name);
		  System.out.println("Id : "+id);
		  System.out.println("Dpartment : "+dept);
		  System.out.println("Marks : "+percent+"%");
		  System.out.println("Grade : "+grade);
		  System.out.println("_______________________");
	  }
	 public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      
      StudentData s1=new StudentData();
	 
	System.out.println("Enter Name,id,Department");
		String n=s.next();
		int i=s.nextInt();
		String d=s.next();
   System.out.println("Enter marks of 5 Subjects");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int m4=s.nextInt();
		int m5=s.nextInt();
		int totall=s1.totall(m1, m2, m3, m4, m5);
		float percent=s1.percent(totall);
		String grade=s1.grade(percent);
		s1.setData(n, i, d, percent, grade);
		System.out.println("_______________________");
		
		System.out.println("Next Student");
		StudentData s2=new StudentData();
		System.out.println("Enter Name,id,Department");
            n=s.next();
		    i=s.nextInt();
		   d=s.next();
   System.out.println("Enter marks of 5 Subjects");
		    m1=s.nextInt();
		    m2=s.nextInt();
		    m3=s.nextInt();
		    m4=s.nextInt();
		    m5=s.nextInt();
		   totall=s1.totall(m1, m2, m3, m4, m5);
	       percent=s1.percent(totall);
	       grade=s1.grade(percent);
		s2.setData(n, i, d, percent, grade);
		System.out.println("_______________________");
		
		System.out.println("Next Student");
		StudentData s3=new StudentData();
		System.out.println("Enter Name,id,Department");
            n=s.next();
		    i=s.nextInt();
		   d=s.next();
   System.out.println("Enter marks of 5 Subjects");
		    m1=s.nextInt();
		    m2=s.nextInt();
		    m3=s.nextInt();
		    m4=s.nextInt();
		    m5=s.nextInt();
		   totall=s1.totall(m1, m2, m3, m4, m5);
	       percent=s1.percent(totall);
	       grade=s1.grade(percent);
		s3.setData(n, i, d, percent, grade);
		System.out.println("_______________________");
			    s1.display();
			    s2.display();
			    s3.display();
}
}