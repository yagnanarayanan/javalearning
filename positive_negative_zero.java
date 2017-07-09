/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class positive_negative_zero
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scan1.nextInt();
		//int a=5;
		if(a==0){System.out.println("number is zero");}
		else if(a>0){System.out.println("number is positive");}
		else{System.out.println("number is negative");}
	}
}