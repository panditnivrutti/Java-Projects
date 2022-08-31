package inheritance_Super_getter;

public class Manager extends Employee{
	int salary;
	String designation;
	
	public void setManagerDesignation(String designation)
	{
		this.designation=designation;
	}
	
	public void setManagerSalary(int salary)
	{
		this.salary=salary;
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Designation : "+designation+ "\n Salary : "+salary+ " Rs. ");
	}

}
