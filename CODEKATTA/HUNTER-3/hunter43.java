package JUNE;
import java.util.Scanner;
public class hunter43 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	String s1=scan.nextLine();
	String s[]=s1.split("[a-z]+|[A-Z]+");
	String s2[]=s1.split("[0-9]+");
	
	
	int p,s3=-1;
	for(int i=1;i<s.length;i++)
		{
		s3=s3+1;
		p=Integer.parseInt(s[i]);
	    for(int i1=0;i1<p;i1++)
	    	System.out.print(s2[s3]);
		}
	   
	    
		
	
	
	}

}
