package CODECHALLENGE;

import java.util.*;
class  c
{
	Scanner scan=new Scanner(System.in);
	void getd()
	{
		int n=scan.nextInt();
		if(n%3==0||n%7==0)
			System.out.print("yes");
		else
			{
			n=n/7;
		    if(n%3==0||n%7==0)
		    	System.out.print("yes");
		    else
		    	System.out.print("no");
			}	
			
		    	
	   
	    		
		    	
		
	}
}
public class sum37
{

	public static void main(String[] args) 
	{
	 c p=new c();
	 p.getd();

	}

}
