package Movie;

public class Theater extends Movie {
	String theater;
	public void setTheater(String theater)
	{
		this.theater=theater;
	}
	
	public void Display()
	{
		super.Display();
		System.out.println("Theater Name : "+theater);
	}

}
