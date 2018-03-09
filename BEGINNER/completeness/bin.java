package CODEKATTAA;
import java.util.*;

public class binaryrep 
{

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int count=0;
		String a2=scan.nextLine();
		char a[]=a2.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='0'||a[i]=='1')
				count=count+1;
		}
		
		if(count==a.length)
		   System.out.print("yes");
		else
			System.out.print("no");
			
			
			
		
		

	}

}
