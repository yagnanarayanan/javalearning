import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vowel_consonant
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter a letter");
		char a=scan1.next().charAt(0);
		//int a=5;
		//if(a==0){System.out.println("number is zero");}
		if(a=='a'|a=='e'|a=='i'|a=='o'|a=='u'){System.out.println("letter is a vowel");}
		else{System.out.println("letter is a consonant");}
	}
}