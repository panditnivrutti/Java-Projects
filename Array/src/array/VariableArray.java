package array;

public class VariableArray {

	static void add(int...a)
	{
		int sum=0;
		{
		for(int i=0;i<a.length;i++)
		sum=sum+a[i];
		}
		System.out.println(sum);
	}
  
	public static void main(String[] args) {
		VariableArray.add(1,2,3);

	}

}
