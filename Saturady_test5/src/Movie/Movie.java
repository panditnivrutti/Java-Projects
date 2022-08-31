package Movie;

public class Movie {
	
	String name; int tprice;
	public void setMovie(String name,int tprice)
	{
	  this.name=name;
	  this.tprice=tprice;
	}
	
	public  void Display()
	{
	System.out.println("Movie Name : "+ name+  " \n Ticket Price : "+tprice);	
		
	}

}
