package Logical_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sorting_Ascending_Desc 
{
public static void main(String[] args) 
{
System.out.println("before sorting ");

	int a[]= {65,4,85,21,36,75,1,2,95,24,7};
	
	for (int i=0; i<=a.length-1;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("In ascending order");
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("In descending order");
	Arrays.sort(a);
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	
	
}
}
