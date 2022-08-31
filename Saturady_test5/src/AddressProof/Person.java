package AddressProof;

public class Person {
 String name,contact,address,idProof;
int id;

public void setPData(String name,int id,String contact,String address,String idProof)
{
	this.name=name;
	this.id=id;
	this.contact=contact;
	this.address=address;
	this.idProof=idProof;
}
public void Display()
{
	
     System.out.println("Person name : "+name+"\nContact no. : "+contact+"\nAddres : "+address);
}
}

