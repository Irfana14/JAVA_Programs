package CODEKATTAA;
import java.io.*;
import java.util.Scanner;

public class promatrix 
{

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String a2 = null;
	 	
		 int r1=scan.nextInt();
		 int c1=r1;
		 int a[][];
		 
	     a=new int[r1][c1];
	  
	     for(int i=0;i<r1;i++)
	     {
	    	 for(int j=0;j<c1;j++)
	    	 {
	    		 a[i][j]=scan.nextInt();
	    	 }
	     }
	          	    
	     int sumOfDiagonal1=0;
         for (int i = 0, j =0; i< r1 && j < c1; i++, j++) {
                sumOfDiagonal1= sumOfDiagonal1 + a[i][j];
                
         }
         int sum=0;
         for(int i=0,j=c1-1;i<r1&&j>=0;i++,j--)
         {
        	 sum= sum + a[i][j];
             
         }
         
         int p=sumOfDiagonal1+sum;
         System.out.print(p);
	   

	}

}
