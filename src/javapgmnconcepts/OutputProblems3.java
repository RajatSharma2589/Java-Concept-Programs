package javapgmnconcepts;

import java.util.HashMap;

public class OutputProblems3 {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    String str = "This This is is done by automation";
    String[] split = str.split(" ");
     
            HashMap<String,Integer> map = new HashMap<String,Integer>();
    for (int i=0; i<split.length; i++) {
    	System.out.println(split[i]);
        if (map.containsKey(split[i])) {
        	
            int count = map.get(split[i]);
           
            System.out.println(count);
            map.put(split[i], count+1);
        }
        else {
            map.put(split[i], 1);
        }
    }
    System.out.println(map);
}

}

