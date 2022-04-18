package javapgmnconcepts;

import java.util.Set;
import java.util.TreeSet;

public class OutputProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Set set = new TreeSet<String>();
		set.add("Green World");
		set.add(1);
		set.add("Green Peas");
		System.out.println(set);*/
		
		/*StringBuffer s1 = new StringBuffer("welcome");
		StringBuffer s2 = new StringBuffer("welcome");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
		*/
		
		int i=12;
		int j=13;
		int k= ++i-j--;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		
	}

}
