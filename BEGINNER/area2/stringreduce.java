package MORESIMPLe;

import java.util.Scanner;

public class firstnchar
{
      
	public static void main(String[] args) 
	{
	 
		Scanner scan=new Scanner(System.in);
		 String s;
		 char a3[];
		 int n;
		 s=scan.nextLine(); n=scan.nextInt();
		 
		 a3=s.toCharArray();
		 
		 
		 
		 for(int i=0;i<n;i++)
			 System.out.print(a3[i]);
		 
		 
		 
		 
		 

	}

}
