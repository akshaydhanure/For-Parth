package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class Repeating_String_In_Para {
public static void main(String[] args) {
	
	String a="akshay ravi dhanure ashwini akshay dhanure aditya ravi dhanure";
	String b[]= a.split("");
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	{
		for(int i=0;i<=a.length()-1;i++)
		{String s= b[i];
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		Set<String> set = map.keySet();
		for(String s:set)
		{
			if(map.get(s)>1)
			{
				System.out.println(s+" : "+map.get(s));
			}
				
		
		
		}
		
	}
	
	
	
	
	
	
}
}
