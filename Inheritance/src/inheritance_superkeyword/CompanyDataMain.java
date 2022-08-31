package inheritance_superkeyword;

public class CompanyDataMain {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.setPersonData("Nivrutti", "9876543210", "At Pune.");
		m.setEmployeeData(12, "ThinQuotient", "Finance");
		m.setManagerData("Assistant Manager", 50000);
		m.display();
	
	}

}
