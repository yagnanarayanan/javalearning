/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class leap_year_finder
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter a year");
		int a=scan1.nextInt();
		if(a%4==0| a%400==0 & a%100!=0){System.out.println("it is leap year");}
		else{System.out.println("it is not leap year");}
	}
}