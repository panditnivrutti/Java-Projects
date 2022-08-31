package array;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
  String array[]= {"java","is","best","Language"};
  System.out.println(Arrays.toString(array));
  System.out.println();
   for (int i=0;i<array.length;i++)
   {
	   System.out.println(array[i]+"-"+array[i].length()+"characters");
   }
   
   //to reverse the strings in array
   System.out.println();
   System.out.println("Reverse of String ");
   for(int i=array.length-1;i>=0;i--)
   {
	   for (int j=array[i].length()-1;j>=0;j--)
	   {
		   System.out.print(array[i].charAt(j));
	   }
	   System.out.println();
   }

}
}