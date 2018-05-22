package JUNE;
import java.util.Scanner;
public class hunter27 
{

	public static void main(String[] args) 
	{
		String s,s3[];
	Scanner scan=new Scanner(System.in);
	s=scan.nextLine();
	s3=new String[s.length()];
	int k=0,max=0;
	for(int i=0;i<(s.length()-1);i++)
	{
		for(int j=i+1;j<=(s.length());j++)
	      {
			//System.out.print("hi");
			String s1=s.substring(i,j);
	     StringBuffer sb=new StringBuffer(s1);
	     String s2=sb.reverse().toString();
	     if(s2.equalsIgnoreCase(s1)!=true)
	     {
	    	 System.out.print(s1+"\n");
	    	 int n=s1.length();
	    	 
	    	 if(s1.length()>=max)
	    	 {
	    		 max=s1.length();
	    		 s3[0]=s2;
	    	 }
	    	 continue;
	     }
	     
	      }//for
	}//for
	
	/*for(int i=0;i<k;i++)*/
		System.out.print(s3[0]);
	
	
	
	}

}
