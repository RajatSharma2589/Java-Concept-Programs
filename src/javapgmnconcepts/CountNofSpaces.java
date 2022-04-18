package javapgmnconcepts;

public class CountNofSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Geek for Geek is a hoax";
		int len = s.length();
		int count=0;
		for(int i=0; i<=len-1;i++)
		{
			
			if((s.charAt(i)!=' '))
			{
				count ++;
			}
			
		}
		System.out.println(count);
		
	}

}
