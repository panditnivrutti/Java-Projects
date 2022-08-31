package inheritance2;

public class Car {
	int id;
	String name,comp;
	Driver d;
	
	
	public void setId(int id)
	{
		this.id = id;
	}


	public int getId()
	{
		return id;
	}
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setComp(String comp)
	{
		this.comp=comp;
	}	
	
	public String getComp()
	{
		return comp;
	}
	public void setD(Driver d)
	{
		this.d=d;
	}
	public Driver getD() {
		return d;
	}
	
	}