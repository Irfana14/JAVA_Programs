package sudharsivasir;
import java.util.Scanner;
class F
{
	Scanner scan=new Scanner(System.in);
    int n,a[],i,count[];
	void getd()
	{
		
	    n=scan.nextInt();
		a=new int[n];
		count=new int[n];
		
		for(i=0;i<a.length;i++)
		{
			count[i]=1;
		}
		
		for(i=0;i<a.length;i++)
		   a[i]=scan.nextInt();
		for(i=0;i<(a.length-1);i++)
		{	
			
			for(int j=i+1;j<(a.length);j++)
			{
				
				if(a[i]==a[j])
				{
					count[i]=count[i]+1;
					a[j]='*';
					//System.out.print(a[i]); 
					//break;
				}//if
			}//for
		}//for
		/*for(int i=0;i<a.length;i++)
			System.out.print(a[i]);*/
			int c=0;	
		for(i=0;i<(a.length);i++)	
			{
			  
			  if(count[i]==1)
				  c=c+1;
			  
			}//for
		if(c==n)
		{
			System.out.print("Unique");
		}//if
		else
			for(int i=0;i<a.length;i++)
	     {
				if(count[i]>=2)
				 {
					System.out.print(a[i]);
				 }
				break;
	     }
		
	}//getd
}//class
			
				
public class firstrepeat
{

	public static void main(String[] args)
	{
		F p=new F();
		p.getd();
	}

}
