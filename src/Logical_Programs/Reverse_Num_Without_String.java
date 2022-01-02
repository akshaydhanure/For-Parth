package Logical_Programs;

import java.util.Scanner;

public class Reverse_Num_Without_String {
public static void main(String[] args) {
	
	System.out.println("Enter a number to reverse ");
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	//int a=457;
	int rev=0;
	for(int i=a;i>0;i=i/10)
	{
		int rem=i%10;
		 rev=(rev*10)+rem;
		 //i=i/10;
		  	 
	}System.out.println(rev);
	if(rev==a)
	{
		System.out.println("The number is a Palindromic Number");
	}
	else
	{
		System.out.println("The number is NOT a Palindromic number");
	}
}
}
