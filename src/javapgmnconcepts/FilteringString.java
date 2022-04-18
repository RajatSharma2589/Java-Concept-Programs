package javapgmnconcepts;

public class FilteringString {

	public static void main(String[] args) {
		
		String name;double price;int quantity;
		String s="Bread$$##599$$##2";
		/*System.out.println(s);
		String[] item=s.split("##");
		
		for(String a : item)
		{
			System.out.println(a);
			if(a.contains("$"))
			{
				String fname = a.replaceAll("[^#.a-zA-Z0-9]","");
				System.out.println(fname);
			}
		}*/
			
		
		String s1=s.replaceAll("[^#a-zA-Z0-9]"," ");

		System.out.println("s1 "+s1);
		String s2=s1.replaceFirst("(?:#)+", ":");
		System.out.println("s2 "+s2);
		String s3=s2.replaceFirst("(?:#)+", ":");
		// String s2 = s1.replace("#","");
		 System.out.println("end " +s3);
		 
		 String[] item=s3.split(":");
		 name=item[0];
		 name.trim();

		price=Double.parseDouble(item[1].trim());
		

		quantity=Integer.parseInt(item[2].trim());

		
		System.out.println("name-"+name);

		System.out.println("price-"+price);

		System.out.println("quantity-"+quantity);

		
		
	}

}
