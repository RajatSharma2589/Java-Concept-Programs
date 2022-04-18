package javapgmnconcepts;

import java.util.HashMap;
import java.util.Map;

public class MapRepeatWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="automation automation is is the the only way";
		char [] ar = s.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(char str : ar)
		{
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
			}else
			{
				map.put(str, 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry: map.entrySet())
		{
			if(entry.getValue()>0)
			{
				System.out.println(entry.getKey()+":"+ entry.getValue());
			}
		}
	
		/* 
		 * String s = "my my name name is is Rajat Rajat";
		 * 
		 * String[] str = s.toString();
		 * 
		 * Map<String,Integer> hm = new HashMap<>();
		 * 
		 * for(String st: str)
		 * {
		 * 	if(hm.containsKey(st))
		 * 		{
		 * 		hm.put(st,hm.get(st)+1);
		 * 		}
		 * else
		 * 		{
		 * 		hm.put(st,1);
		 * 		}
		 * }
		 * 
		 * for(Map.Entry<String,Integer> entry : hm.entrySet())
		 * {
		 * 		if(entrySet.getValue()>0)
		 * 		{
		 * 			System.out.println(entry.getKey() + ":" entry.getValue());
		 * 		}
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
