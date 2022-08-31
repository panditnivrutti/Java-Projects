package time_date_getter;

public class DateTimeMain {

	public static void main(String[] args) {
       Day d1=new Day();
       d1.setDd(15);
       d1.setMm(8);
       d1.setYy(2022);
       d1.setHrs(11);
       d1.setMins(59);
       d1.setSec(00);
       d1.setD("Monday");
       
       System.out.println(d1.getD()+ " "+d1.getDd()+"/"+d1.getMm()+"/"+d1.getYy()+"/  "+d1.getHrs()+":"+d1.getMins()+":"+d1.getSec());
	}

}


























