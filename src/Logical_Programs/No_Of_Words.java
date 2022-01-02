package Logical_Programs;

public class No_Of_Words {
public static void main(String[]args)
{
	String a="India is my country I love my India";
	String ref=" ";
	int count=0;
	
	System.out.println(a.length());
	String []s= a.split(ref);
	System.out.println(""+s.length);
	for(int i=0;i<=s.length-1;i++)
	{
		count++;
	}
	System.out.println(count);
	
}
}
