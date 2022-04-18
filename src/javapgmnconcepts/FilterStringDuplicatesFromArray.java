package javapgmnconcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FilterStringDuplicatesFromArray {

	public static void main(String[] args) {

		String []str = {"a","a","b","b","c","c"};
		Set<String> setArr = new HashSet<String>(Arrays.asList(str));
		
		System.out.println(setArr);
	}

}
