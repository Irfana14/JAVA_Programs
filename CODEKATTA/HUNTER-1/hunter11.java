package JUNE;
import java.util.Scanner;
public class hunter11 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
        String s[]=scan.nextLine().split(" ");
        String s1="";
       
        for(int i=0;i<(s.length);i++)
        {
        	
        	 StringBuffer sb=new StringBuffer(s[i]);
        	 System.out.print(sb.reverse()+" ");
        	
        	
        }
        
        
        
       
       

	}

}
