package MORESIMPLe;

import java.util.Scanner;

public class differencecheck 
{

	public static void main(String[] args) 
	{
		int n,n2,d;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();n2=scan.nextInt();
		d=Math.abs(n-n2);
		if(d%2==0)
			System.out.print("even");
		else
			System.out.print("odd");
		
				
		

	}

}
