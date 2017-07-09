/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class letter_or_number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter a character");
		char a=scan1.next().charAt(0);
		//int a=5;
		//if(a==0){System.out.println("number is zero");}
		if(a>='0' & a<='9'){System.out.println("charecter is number");}
		else{System.out.println("charecter is letter");}
	}
}