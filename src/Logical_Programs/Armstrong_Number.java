package Logical_Programs;

import java.util.Scanner;

public class Armstrong_Number {
public static void main(String[] args) {
	System.out.println("Enter a number to check wether it is a Armstrong number");
	Scanner sc=new Scanner(System.in);
	int a = sc.nextInt();
	//int a=407;
	int sum=0;
	for(int i=a;i>0;i=i/10)
	{
		 int rem=i%10;
		 sum=sum+(rem*rem*rem);
	}System.out.println(sum);
if (a==sum)
{
	System.out.println("the number is an Armstrong Number");
	}
else
{
	System.out.println("The number is NOT an Armstrong number");
}
}
}
