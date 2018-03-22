package MALLOW;
import java.util.Scanner;
class I
{
	int n;
	int a[],b[],c[],flag=0;
	
	void getd()
	{
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=new int[n];
		b=new int[10];
		c=new int[10];
		int sum,sum1;
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		for(int j=1;j<a.length;j++)
			{
			sum=0;
			sum1=0;
			for(int i=0;i<j;i++)
				{
				  b[i]=a[i];
				  sum=sum+b[i];
				}
			int t=0;
			 for(int k=j+1;k<a.length;k++)
			 {
				 c[t++]=a[k];
				 sum1=sum1+c[t];
			 }
			 if(sum==sum1)
			 {
				 System.out.print("yes");
				 flag=1;
				// System.out.print(j+1);
			     break;
			 }
			 
			    
			}//for
		//System.out.print(a[i])
	  if(flag==0)
		  System.out.print("no");
	}
}
public class arrayindex
{

	public static void main(String[] args) 
	{
		I p=new I();
		p.getd();
	}

}
