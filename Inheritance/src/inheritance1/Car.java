package inheritance1;

public class Car {
	int id;
	String name,comp;
	Driver d;
	
/*	Car(int id,String name,String comp,Driver d)          //agrigation
	{
		this.id=id;
		this.name=name;
		this.comp=comp;
		this.d=d;
		
	}*/
	Car(int id,String name,String comp,Driver d)         //compostion
	{
		this.id=id;
		this.name=name;
		this.comp=comp;
		this.d=new Driver(1,"Jayesh","987654321");
		
	}

	public String toString()
	{
		return id+" "+name+ " " +comp+ " : "+d ;
	}

}
