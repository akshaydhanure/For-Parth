package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class Find_Duplicate_in_Array {
public static void main(String[] args) {
	String a[]= {"akshay","ravi","dhanure","ashwini","akshay","dhanure",};
	
	HashMap<String, Integer> map= new HashMap<String, Integer>();
	for(String s:a)
	{if(map.containsKey(s))
	{
		map.put(s, map.get(s)+1);
	}
	else
	{
		map.put(s, 1);
	}
	}
	Set<String>setValue=map.keySet();
	for(String s:setValue)
	{
		if(map.get(s)>1)
		{
			System.out.println(s+" : "+map.get(s));
		}
		else
		{
			System.out.println(s+" : "+map.get(s));
		}
	}
	
	
	
}
}
