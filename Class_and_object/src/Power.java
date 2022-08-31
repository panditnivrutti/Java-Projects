import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
System.out.println("Enter its power");
int power=s.nextInt();

int prd = 1, i;
for (i=1;i<=power;i++)
{
	prd=prd*num;
	}
System.out.println("Power of number : "+prd);
	}

}
