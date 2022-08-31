package inheritance_superkeyword;

public class Manager extends Employee{
	int salary;
	String designation;
	
	public void setManagerData(String designation,int salary)
	{
		this.designation=designation;
		this.salary=salary;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Designation : "+designation+ "\n Salary : "+salary+ " Rs. ");
	}

}
