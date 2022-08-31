package saturday_test;

import java.util.Scanner;

public class NationalGames {
	void india()
	{
		System.out.println("National Game of India : HOCKY");
	}

	void china()
	{
		System.out.println("National Game of China : Table Tennis");
	}
	void bangladesh()
	{
		System.out.println("National Game of bangladesh : Kabaddi");
	}
	void italy()
	{
		System.out.println("National Game of Italy : Football");
	}
	void unitedStates()
	{
		System.out.println("National Game of United States : Baseball");
	}
	public static void main(String[] args) {
		NationalGames n=new NationalGames();
      Scanner s=new Scanner (System.in);
      System.out.println("Enter any country name for ex.");
      System.out.println("india,china,bangladesh,italy,unitedStates");
      String st=s.next();
      switch(st)
      {
	     case "india"      : n.india();
	          break;
	     case "china"      : n.china();
	          break;
	     case "bangladesh" : n.bangladesh();
	          break;
	     case "italy"      : n.italy();
	          break;
	     case "unitedSates":n.unitedStates(); 
	          break;
	     default           : System.out.println("Invalid input");
      }	  
	}

}
