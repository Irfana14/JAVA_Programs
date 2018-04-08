package CODEKATTAA2;
import java.util.*;
class I
{
	void getd()
	{
		String s[],s1[];
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine().split(" ");
		String s4="";
		s1=s;

		for(int i=0;i<s.length;i++)
		{
			s[i].toLowerCase();
		
			String t;
			if(i==0)
			{
				if(s[i].equalsIgnoreCase("and"))
				     continue;
			}
			else
			{	if(i!=0&&i!=s.length-1)
					 {
					if(s[i].equalsIgnoreCase("and"))
			             {
					
				String s3=s[i-1].replaceAll(s[i-1], s[i+1]);
	     		String s5=s[i+1].replaceAll(s[i+1], s1[i-1]);
			              s1[i-1]=s3;
			                 //System.out.print(s1[i-1]);
			              s1[i+1]=s5;
			               //System.out.print(s1[i]);
			              //System.out.print(s1[i+1]);
				          
			                }//if
					 }//if
			}//else
		}
		
	for(int i=0;i<s1.length;i++)
		System.out.print(s1[i]+" ");
	//System.out.print(s1[s1.length-1]);	
		
	}
}
public class interwords
{

	public static void main(String[] args) 
	{
	
		I p=new I();
		p.getd();
	}

}
