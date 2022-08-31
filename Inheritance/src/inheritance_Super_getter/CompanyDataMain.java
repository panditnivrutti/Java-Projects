package inheritance_Super_getter;

public class CompanyDataMain {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.setPersonName("Nivrutti");
		m.setPersonContact("9876543210");
		m.setPersonAddress("At pune");
		
		m.setEmployeeCompany("ThinQoutient");
		m.setEmployeeDept("Finance");
		m.setEmployeeId(123);
		
		m.setManagerDesignation("Assistant Manager");
		m.setManagerSalary(30000);
		m.display();
	
	}

}
