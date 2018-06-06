package JUNE;

import java.util.ArrayList;
import java.util.Scanner;

public class hunter66 
{

	public static void main(String[] args) 
	{
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();int n3=scan.nextInt();
     int count=0;
    ArrayList al=new ArrayList();
    
    String s;
     for(int i=0;i<=n;i++)
    	{
    	 String s1=scan.nextLine();
         al.add(s1);
    	}
     
   for(int i=1;i<al.size();i++)
   {
	 
	   s=al.get(i).toString().substring(0,2);
	   
	   int n1=Integer.parseInt(s);
	   if(n1==n3)
		   
		   count=count+1;
	   
   }
   
   System.out.print(count);
   
   
	}
}
