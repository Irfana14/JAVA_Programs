package JUNE;

import java.util.Scanner;

public class hunter48 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();String s1=scan.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			if(n.contains(s1))
			{
				System.out.print(n.indexOf(s1));
				break;
				
			}
			else
				{System.out.print("-1");
			     break;}
		}
				
		
		
		
	}

}
