import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class no_of_digits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter a number");
		int s=0;
		int a=scan1.nextInt();
		while(a != 0)
    {
        a /= 10;
        ++s;
    }
		System.out.println("no of digits="+s);
	}
}