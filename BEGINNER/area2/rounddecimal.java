package MORESIMPLe;
import java.util.*;

public class decimalroundoff 
{
	
	
	public static void main(String[] args)
	{
		 Scanner scan=new Scanner(System.in);
		 String s;
		 char a[];
		 s=scan.nextLine();
		 a=s.toCharArray();
		if(Character.getNumericValue(a[2])>=5)
		
			System.out.print(Character.getNumericValue(a[0])+1);
		
		else
			System.out.print(a[0]);
			
		
		

	}

}
