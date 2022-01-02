package Logical_Programs;

import java.util.Scanner;

public class Reverse_IntegerNumber {
public static void main(String[] args) {
	System.out.println("Enter a number to reverse ");
	Scanner sc= new Scanner(System.in);
	long a= sc.nextInt();
	
	//int a=154798;
	String b = Long.toString(a);
	System.out.println("The original number is "+b);
	String rev="";
	for(int i=b.length()-1;i>=0;i--)
	{
		rev=rev+b.charAt(i);
		
	}
	int revnum=Integer.parseInt(rev);
	System.out.println("The reverse of th number is "+revnum);
}
}
