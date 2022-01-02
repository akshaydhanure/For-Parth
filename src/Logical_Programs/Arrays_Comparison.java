package Logical_Programs;

import java.util.Arrays;

public class Arrays_Comparison
{public static void main(String[] args) {
	int a[]= {5,81,6};
	int b[]= {8,7,90};
	int c[]= {5,81,6};
	
	System.out.println(Arrays.equals(a, c));
	System.out.println(Arrays.equals(a, b));
	
	int ar[][]= {{2,3,5},{8,5,4},{2,3,5}};
int br[][]= {{2,3,5},{8,5,4},{2,3,5}};
System.out.println(Arrays.deepEquals(ar, br));

}

}
