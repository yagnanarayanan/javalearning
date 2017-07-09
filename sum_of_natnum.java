/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sum_of_natnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter a number to sum natural numbers");
		int a=scan1.nextInt();
		int s=0;
		int i=0;
		while(i<=a)
		{
			s=s+i;
			i++;
		}
		System.out.println("sum natural numbers"+s);
	}
}