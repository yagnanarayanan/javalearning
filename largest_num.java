/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class largest_num
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int a=scan1.nextInt();
		int b=scan1.nextInt();
		int c=scan1.nextInt();
		if(a>b & a>c){System.out.println("first number is largest");}
		else if(b>a & b>c){System.out.println("second number is largest");}
		else{System.out.println("third number is largest");}
	}
}