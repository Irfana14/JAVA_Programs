package TEST;
import java.util.Scanner;
public class pattern 
{
   public static void main(String args[])
   {
	   Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int t=n;
	    while(t>0)
	    {
	    for(int i=n;i>0;i--)
	    {
	    	System.out.print("1 ");
	    }//for
	    System.out.print("\n");
	   n--;
	   t--;
	    }
   }//main
   
}//class
