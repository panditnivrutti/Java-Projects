package Laptop;

public class Specs extends Brand {
	String processor,ram,storage;
	
	public void setData(String processor,String ram,String storage)
	{
		this.processor=processor;
	     this.ram=ram;
	     this.storage=storage;
	}
	
	public void Display()
	{
		super.Display();
		System.out.println("Processor : "+processor+"\nRam : "+ram+" \nStorage : "+storage);
	}
	
	

}
