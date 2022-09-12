import java.util.Scanner;

public class TeachersDay {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in).useDelimiter("\n");
		System.out.println("please Give input : ");
		String input=s.next();
		if (input.equalsIgnoreCase("best teacher"))
		{
			System.out.println("Raksha Mam .. :)");
			System.out.println("Happy teachers day Mam ");
		}
		else
			System.out.println("Please enter 'best teacher'");
		
	}

}
