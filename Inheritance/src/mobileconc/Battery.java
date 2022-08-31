package mobileconc;

public class Battery {
  int id;
  String name,capacity;
  
  
  Battery(String name,int id,String capacity)
  {
	  this.name=name;
	  this.id=id;
	  this.capacity=capacity;
  }
  
  public String toString()
  {
	  return "Battery name : " +name+ " Battery capacity : " +capacity;
  }
}
