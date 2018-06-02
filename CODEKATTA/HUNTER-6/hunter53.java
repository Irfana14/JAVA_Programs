package JUNE;

import java.util.Scanner;

public class hunter53 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
	   int k=scan.nextInt();
	   int m=1;
		for(int i=0;i<s.length();i++)
		{ 
			if(k<=s.length())
			{System.out.print(s.substring(i,k)+" ");
			k=k+m;
			}
		}

		
	}

}
