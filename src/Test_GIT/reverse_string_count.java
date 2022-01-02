package Test_GIT;

public class reverse_string_count {

	public static void main(String[] args) {
		String S1= "I LOVE INDIA";
		
		 String ref = " ";
		String output[]=S1.split(ref);
		System.out.println("String  word calculate");
		System.out.println(output.length);
		System.out.println("Calculate String length");
		System.out.println(S1.length());
		
		for(int i=S1.length()-1;i>=0;i--)
		{
			
			ref=ref+S1.charAt(i);
		}
		System.out.println("given string"+S1);
		System.out.println("output string "+ref);
		
		
		
		
		
//		int a=10;
//		 a = a+15;
		

	}

}
