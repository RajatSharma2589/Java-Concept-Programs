package javapgmnconcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class OutputProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection c = new ArrayList();
		c.add(10);
		c.add("A");
		
		Collection l =new HashSet();
		l.add(10);
		l.add("B");
		l.add(30);
		l.add(30);
		
		c.addAll(l);
		System.out.println(c);
		
		c.removeAll(l);
		
		System.out.println(c);
	}

}
