package javapgmnconcepts;

public class VowelSubstring {

	String name;double price;int quantity;
	
	VowelSubstring(String rawInput)   
	{
	String s1=rawInput.replaceAll("[^#.a-zA-Z0-9]","");

	//System.out.println(s1);
	String s2=s1.replaceFirst("(?:#)+", " ");

	String s3=s2.replaceFirst("(?:#)+", " ");
	// String s2 = s1.replace("#","");
	 System.out.println(s3);

	String[] item=s3.split(" ");name=item[0];

	price=Double.parseDouble(item[1]);

	quantity=Integer.parseInt(item[2]);
	}

	public static void main(String[] args) {
		
		VowelSubstring vs = new VowelSubstring("Mobile Phone$$##599$$##2");
		
		
	}

}
