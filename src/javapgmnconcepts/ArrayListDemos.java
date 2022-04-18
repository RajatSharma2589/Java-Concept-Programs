package javapgmnconcepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemos {


	public static void main(String[] args) {

		ArrayList<String> fruits1 = new ArrayList<String>();

		fruits1.add("oranges");
		fruits1.add("banana");
		fruits1.add("mangoes");

		/*ArrayList<String> clone = (ArrayList<String>) al.clone();
		System.out.println(clone);
		 */

		ArrayList<String> fruits2 = new ArrayList<String>();

		fruits2.add("apple");
		fruits2.add("grapes");
		fruits2.add("blackgrapes");

		ArrayList<String> fruitsBasket = new ArrayList<String>(3);

		fruitsBasket.add("bread");
		fruitsBasket.add("loafs");
		fruitsBasket.add("croissant");
		
		
		
	//	Collections.copy(fruitsBasket, fruits1);
		//System.out.println(fruits1);	
		
		Collections.swap(fruitsBasket, 0, 1);
		System.out.println(fruitsBasket);
		
		
		
		
		




	}

}
