package CODEKATTAA;
import java.util.Scanner;
class repeat
{
	String str;
	void getd()
	{
		
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		char a[]=str.toCharArray();
		
		
		for(int i=0;i<(a.length-1);i++)
			{
			if(Character.isLetter(a[i]))
			{  for(int j=i+1;j<a.length;j++)
			  {
				  if(a[i]==a[j])
					  a[j]='*';
				  
			  }
			}//if
			
			}//for
		for(int i=0;i<a.length;i++)
			{
			if(a[i]!='*')
				System.out.print(a[i]);
			}
				
		
		
	}//getd
}//repeat
public class repeatcharremove
{

	public static void main(String[] args) 
	{
		repeat p=new repeat();
		p.getd();

	}

}
