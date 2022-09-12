import java.util.Scanner;

public class Student {
	private String name, dept;
	private int id,m1,m2,m3;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	

	public String getDept() 
	{
		return dept;
	}
	public void setDept(String dept) 
	{
		this.dept = dept;
	}
	public int getM1() 
	{
		return m1;
	}
	public void setM1(int m1) 
	{
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) 
	{
		this.m2 = m2;
	}
	public int getM3() 
	{
		return m3;
	}
	public void setM3(int m3) 
	{
		this.m3 = m3;
	}
	public void percent()
	{
		 float percent =0;
		 percent=(getM1()+getM2()+getM3())/3;
		 System.out.println("Percentage = "+percent);
		 
	}
	
	public static void main(String[] args) 
	{
     Student s1=new Student();
     s1.setName("Nivrutti");
     s1.setId(123);
     s1.setDept("Computor");
     s1.setM1(90);
     s1.setM2(92);
     s1.setM3(99);
     s1.percent();
      
      
	}

}
