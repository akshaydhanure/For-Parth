package Logical_Programs;

import java.util.Scanner;

public class Multiply_2Nos_Without_Sign 
{public static void main(String[] args) 
{System.out.println("enter the two nos to multiply");
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int b= sc.nextInt();
//int a= 5;
	//int b= 5;
	int mul=0;
	for (int i=1;i<=b;i++)
	{
		mul=mul+a;
		System.out.println(mul);
	}//System.out.println("Multiplication of two nos is "+mul);
	
	
	
	
}

}
