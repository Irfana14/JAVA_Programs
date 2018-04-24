package codekatta1;
import java.util.Scanner;

public class substring 
{

	public static void main(String[] args)
	{
		  String s,s1,s2;
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		s1 =scan.nextLine();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
		  {
				s2=s.substring(i,j);
		  System.out.print(s2+"\n");
		  if(s2.equals(s1))
		  {
			  System.out.print("yes");
		        System.exit(0);
		       
		  }
		  
		  }
		}
		
  
   

	}

}
