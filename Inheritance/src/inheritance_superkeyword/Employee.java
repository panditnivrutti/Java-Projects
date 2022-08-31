package inheritance_superkeyword;

public class Employee extends Person {
String company,dept;
int id;

public void setEmployeeData(int id,String company,String dept )
{
this.id=id;
this.company=company;
this.dept=dept;
}
public void display()
{
	 super.display();
	System.out.println(" Id : "+id+ "\n Company name : "+company+ "\nDepartment : "+dept);
}

}
