package javapgmnconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapHackerRank {

	public static void main(String[] args) {
		{
	        String name;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter a no. of rec: ");  
			int n=in.nextInt();
			in.nextLine();
			ArrayList<String> phName = new ArrayList<String>();
			for(int i=0;i<n;i++)
			{
				System.out.print("Enter a name: ");
				name=in.nextLine(); 
				phName.add(name);
				System.out.print("Enter a their number: ");
				int phone=in.nextInt();
				in.nextLine();
			}
			
			
	        HashMap<String,Integer> hm = new HashMap<String,Integer>();
	        
	        hm.put("uncle sam",99912222);
	        hm.put("harry",12299933);
	        
	        for(String fname : phName)
	        {
	        	if(!hm.containsKey(fname))
	        	{
	        		System.out.println("not found");
	        	}
	        }
	        
	        for(Map.Entry<String,Integer> entry : hm.entrySet())
	        {
	            System.out.println(entry.getKey()+"="+ entry.getValue());
	            
	        }
	    

	}
	}
}

