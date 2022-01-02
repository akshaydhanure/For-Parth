package Logical_Programs;

public class RightAngle {
	public static void main(String[] args) {
		int a,b, row=5;
		
		for (a=0;a<=row;a++)
		{
			for (b=2*(row-a);b>=0;b--)
			{System.out.print(" ");
		}
			for(b=0;b<=a;b++) {
				System.out.print("* ");
			}
		System.out.println();	
	}
	}
}
