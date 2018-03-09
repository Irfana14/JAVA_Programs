package ZOHO;
import java.util.*;

public class casechange
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(Character.isUpperCase(a[i]))
					System.out.print(Character.toLowerCase(a[i]));
			if(Character.isLowerCase(a[i]))
				    System.out.print(Character.toUpperCase(a[i]));
		}
		
	
		

	}

}
