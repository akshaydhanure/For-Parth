package Logical_Programs;

import java.util.Scanner;

public class Prime_Numbers {
public static void main(String[] args) {
	
	System.out.println("Enter a number to check wether it is a Prime number");
	Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();
	//int a= 5;
	int c=0;
	for (int i=2;i<a;i++)
	{
		if (a%i==0)
		{
			c++;
			break;
		}
	}	if(c==1)
		{
			System.out.println("The entered number is NOT a prime number");
		}
		else
		{
			System.out.println("The entered number is a Prime number");
		}
	
}
}
