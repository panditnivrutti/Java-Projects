package time_date;

public class Day extends Time {
	String day;
	 void setDay(String day)
	{
		this.day=day;
	}
	
	void Display()
	{
		System.out.println(day+ ""+dd+"/"+mm+"/"+yy+" : "+hrs+":"+mins+":"+sec);
	}

}
