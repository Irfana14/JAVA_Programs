package JUNE;
import java.util.Scanner;
public class hunter35 
{
	public static void main(String[] args) 
	{
		int n,n1,n2;
		String s;
		Scanner scan=new Scanner(System.in);
	 s=scan.nextLine();
	 n=s.length();
	 n1=n/2;
	
	 if(n%2==0)
	 {
			   String str=s.substring(0,n1);
			  
			   String str1=s.substring(n1,n);
			 
		       if(str.equalsIgnoreCase(str1))
		    		   System.out.print("YES");
		       else
		    	   System.out.print("NO");
	
	 }//if
	 
	 else
	 	{
		    
		    String str=s.substring(0,n1);
		   
			   String str1=s.substring(n1+1,n);
			  
		       if(str.equalsIgnoreCase(str1))
		    		   System.out.print("YES");
		       else
		    	   System.out.print("NO");
	 	}
	           
		 
	 
	 
	 
	 

	}

}
