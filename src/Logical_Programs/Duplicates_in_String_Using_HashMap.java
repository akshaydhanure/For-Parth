package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class Duplicates_in_String_Using_HashMap {
public static void main(String[] args) {
System.out.println("Enter the words");
String a="akshay ravi dhanure";
HashMap<Character, Integer> map= new HashMap<Character, Integer>();

for(int i=0;i<=a.length()-1;i++)
{char c = a.charAt(i);
	if(map.containsKey(c))
	{
		map.put(c, map.get(c)+1);
	}
	else
	{
		map.put(c, 1);
	}
}
	Set<Character> set = map.keySet();
	for(Character c:set)
	{
		if(map.get(c)>1)
		{
			System.out.println(c+" : "+map.get(c));
		}
	}
	
	

}
}
