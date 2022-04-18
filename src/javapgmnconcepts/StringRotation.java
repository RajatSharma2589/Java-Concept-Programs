package javapgmnconcepts;

public class StringRotation {

	/*public static boolean checkRotatation(String original, String rotation) 
	{ 
		if (original.length() != rotation.length()) 
		{ return false; 
		}

		String concatenated = original + original; 
		System.out.println(concatenated.indexOf(rotation));
		
		if (concatenated.indexOf(rotation) != -1) 
		{ return true; 
		}
		return false; 
	} */


	public static void main(String[] args) {
		/*String input="IndiaVsAustralia";
		String rotation ="IndiaVsAustralia";

		if (checkRotatation(input, rotation)) { 
			System.out.println(input + " and " + rotation + " are rotation of each other");
		} else 
		{
			System.out.println("Sorry, they are not rotation of another");
		}

*/
		
		String s="AustraliaIndiaVs";
		String s1="VsAustraliaIndia";
		String s2=s+s;
		int n=s2.length();
		int n1=n/2;
		System.out.println(n+""+n1);
		System.out.println(s2);
		String s4=s2.substring(((n1/2)-1),((n-(n1/2))-1));
		System.out.println(s4);
		if(s4.equals(s1)){
		System.out.println("Treu");

		}
		else
		{
		System.out.println("False");
		}
		}
		
}

