package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class Duplicate_Character {
public static void main(String[] args) {
	char b[]= {'a','c','f','c','h','a'};

	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
	for(char c:b)
	{
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
