package Logical_Programs;

public class ThreeDigitArmstrongNos 
{
public static void main(String[] args) 
{

int n=0;

for(int a=100;a<=999;a++)
{
for (int i=a;i>0;i=i/10)
{
	int rem=i%10;
	n=n+(rem*rem*rem);

}
if(n==a)

{
	System.out.println(n+"  ");
}

n=0;
}

//System.out.println(n);
	
	
}
}
