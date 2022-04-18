package javapgmnconcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomFnameLname {

	Random rFirst;
	Random rLast;
	
	String[] _firstName =  new String[] { "Adam", "Alex", "Aaron", "Ben", "Carl", "Dan", "David", "Edward",
			"Fred", "Frank", "George", "Hal", "Hank", "Ike", "John", "Jack", "Joe", "Larry", "Monte", 
			"Matthew", "Mark", "Nathan", "Otto", "Paul", "Peter", "Roger", "Roger", "Steve", "Thomas", 
			"Tim", "Ty", "Victor", "Walter"};   
	
	String[] _lastName = new String[] { "Anderson", "Ashwoon", "Aikin", "Bateman", "Bongard", "Bowers",
			"Boyd", "Cannon", "Cast", "Deitz", "Dewalt", "Ebner", "Frick", "Hancock", "Haworth", "Hesch", 
			"Hoffman", "Kassing", "Knutson", "Lawless", "Lawicki", "Mccord","Tisler" };
	
	public RandomFnameLname() 
	{ 
		rFirst = new Random(); 
		rLast = new Random(rFirst.nextInt());
	}
	
	public String[] GenerateName()
	{
		String[] results = new String[2];
		results[0] = _firstName[rFirst.nextInt(_firstName.length)];
		results[1] = _lastName[rLast.nextInt(_lastName.length)];
		System.out.println(results[0] + results[1]);
		return results;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*List<String> fname= Arrays.asList("Jim","Tony","Ben","jazz");
		
		Collections.shuffle(fname);
		
		List<String> lname= Arrays.asList("sharma","gupta","singh","reddy");
		
		Collections.shuffle(lname);
		
		System.out.println(fname);
		System.out.println(lname);
		
		for(String name: fname)
		{
			
		}*/
//-------------------------------------------------------------------------------------
	
		RandomFnameLname randomName = new RandomFnameLname();
		randomName.GenerateName();
		
		
	}

}
