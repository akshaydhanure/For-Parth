package Logical_Programs;

import java.util.Scanner;

public class Reverse_String 
{public static void main(String[] args)
{Scanner sc= new Scanner(System.in);
System.out.println("enter the word");
String s=sc.next();
	//String s= "Akshay";
	String rev="";
	
	for (int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}System.out.println(rev);
	if(s.equals(rev))
	{
		System.out.println("entered word is palindrome");
	}
	else
	{
		System.out.println("entered word is NOT palindrome");
	}
	
	
	
}

}
