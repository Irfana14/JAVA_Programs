package CODEKATTAA2;
import java.util.*;

public class dcitobin 
{

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int bin[];
		bin=new int[40];
		int k=0;
		while(n>0)
		{
			bin[k++]=n%2;
			n=n/2;
			
		}	
       System.out.print(k);
	}

}
