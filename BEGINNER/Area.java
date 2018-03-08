import java.util.*;
class A
{
	Scanner scan=new Scanner(System.in);
	int n,n1;
	int Area;

	void getd()
	{
		n=scan.nextInt();
		n1=scan.nextInt();
		Area=(int) (((1)*(n)*(n1)))/2;
		System.out.print(Area);
	}//getd
}

public class matrixpro
{
   public static void main(String args[])
  
   {
	  A p=new A();
	  p.getd();
	  
   }
   
}
