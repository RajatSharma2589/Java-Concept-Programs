package javapgmnconcepts;

public class StringProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Aashish:1, Bina:2, Chintu:3";
		String price = String.format ("%d", 123);
		System.out.println(price);
		String s1 = String.valueOf(15);
		System.out.println(s1);
		String s ="abc";
		String ros = s.substring(0,1);
		String res = s.substring(0+1);
		
		System.out.println("ros: "+ros);
		System.out.println("res: "+res);

		String[] stringSplit = str.split(",");
		int len = stringSplit.length;
		for(String part : stringSplit)
		{
		//System.out.println(stringSplit);
		
		String[] stdData =part.split(":");
		String name =stdData[0].trim();
		String rollNo = stdData[1].trim();
		System.out.println(name);
		System.out.println(rollNo);
		
		String st="selenium";
		String st1 = new String("selenium");
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		

		}
		
		
		
		
		
		
		
		
	}

}
