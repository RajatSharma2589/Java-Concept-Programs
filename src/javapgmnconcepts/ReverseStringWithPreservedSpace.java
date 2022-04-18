package javapgmnconcepts;

public class ReverseStringWithPreservedSpace {

	public static void reverseWithSpace(String s){
		
		char [] input = s.toCharArray();
		char [] result = new char[input.length];
		
		for(int i=0;i<s.length();i++)
		{
			if(input[i]==' ')
			{
				result[i]=' ';
			}
		}
		int j=s.length()-1;
		for(int i=0;i<s.length();i++)
		{
			
			if(input[i]!=' ')
			{

			if(result[j]==' ')
			{
				j--;
			}
			
			result[j]=input[i];
			j--;
			
		}
			
		}
		System.out.println(s.valueOf(result));
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s ="This is my India";	
	reverseWithSpace(s);
		
		
		
		
	}

}
