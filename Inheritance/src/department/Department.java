package department;

public class Department {
 int id,nos;
 String name,hod;
 Student s;
 Department(String name,int id,String hod,int nos,Student s)
 {
	 this.name=name;
	 this.id=id;
	 this.hod=hod;
	 this.nos=nos;
	 this.s=s;
 }
public String toString()
 {
	return "Department name : " + name+ " , Head Of Department  : " +hod+ " , No.of students : " +nos+ " " +s ;
 }
}
