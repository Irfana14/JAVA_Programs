package MORESIMPLe;
import java.util.*;


public class odddigit 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
	 String s;
	 char a[];
	 s=scan.nextLine();
	 a=s.toCharArray();
	 for(int i=0;i<a.length;i++)
	 {
		 if(Character.getNumericValue(a[i])%2!=0)
		 {
			System.out.print(Character.getNumericValue(a[i])+" "); 
		 }
		 
	 }
			 
				 
	 
		
	}//getd

}//class
