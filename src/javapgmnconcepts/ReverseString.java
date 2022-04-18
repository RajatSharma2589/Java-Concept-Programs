package javapgmnconcepts;

public class ReverseString {

	// Reverse a String in Recusive Manner
	public static String reverseString(String str)
	{
		if(str.isEmpty())
		{
			System.out.println("empty string");

			return str;

		}
		System.out.println("String to be passed in Recursive Function: "+str.substring(1));
		return reverseString(str.substring(1))+str.charAt(0);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//======================Reverse String in recursive manner================
		/*String myStr = "Guru99";
		//System.out.println(myStr.substring(1));

//create Method and pass and input parameter string 
		String reversed = reverseString(myStr);
		System.out.println("The reversed string is: " + reversed);*/
//============================================================================




		/*// ---------Method 1---Using String Builder/String Buffer-------------
		String s ="AUTOMATION";

		StringBuffer sb = new StringBuffer();
		StringBuffer result = new StringBuffer();

		sb.append(s);
		result = sb.reverse();

		System.out.println(result);*/

	}

}


//----method 2 using String methods-------
/*
 String rev ="";
String s ="AUTOMATION";
int len = s.length();

for(int i=len-1;i>=0;i--)
{

	rev = rev+ s.charAt(i);

}
System.out.println(rev);*/

// ---------Method 3 Using String methods-----------------
/*
 String s ="AUTOMATION";
		int len = s.length();

		for(int i=len-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));

		}	
 */

//-------Method 4 Using String Array----------

String s ="AUTOMATION";

String [] str =s.split("");

int len = str.length;

for(int i=len-1;i>=0;i--)
{
	System.out.println(str[i]);

}	
}
}

//---------Method 5 Using Character array---------------

/*
String s ="AUTOMATION";

char [] str =s.toCharArray();

int len = str.length;

for(int i=len-1;i>=0;i--)
{
	System.out.println(str[i]);

}	
 */



