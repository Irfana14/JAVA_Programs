import java.util.Scanner;
import java.util.*;
public class V1
{
   public static void main(String args[])
   {
	   Scanner scan=new Scanner(System.in);
	   String s=scan.nextLine();
	   String s1=scan.nextLine(); 
	   ArrayList<String> al=new ArrayList<String>();
	   int p=0,t=0;
	   int n2=s.length();
	   while(t<s.length())
	   {
		   for(int i=t;i<s.length();)
	   {
		   if(p<n2)
			{p=p+1;
		   String s2=s.substring(i,i+p);
		  
		   int n=s2.length();
		   for(int j=0;j<(s1.length()-n);j++)
		   { 
			   if(s2.contentEquals(s1.substring(j,j+n)))
			   {
				  al.add(s2);
				  break;
			   }//if
			   
		   }//for
			}
		   else
			   break;
		  
	   }//for
		   t++;
		
		   p=0;
		   n2--;
	   }//while
	 
	   int max=al.get(0).length();
	   
	   int pos=0;
	   for(int i=0;i<al.size();i++)
	   {
		   if(al.get(i).length()>max)
			   {max=al.get(i).length();
			   pos=i;
			   }
	   }
	   System.out.print(al.get(pos));
   }//main
}//class
