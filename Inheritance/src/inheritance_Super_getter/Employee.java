package inheritance_Super_getter;

public class Employee extends Person {
String company,dept;
int id;

public void setEmployeeCompany(String company)
{
this.company=company;	
}

public void setEmployeeDept(String dept)
{
  this.dept=dept;	
}

public void setEmployeeId(int id)
{
  this.id=id;	
}


public void display()
{
	 super.display();
	System.out.println(" Id : "+id+ "\n Company name : "+company+ "\nDepartment : "+dept);
}

}
