package javapgmnconcepts;

public class StringPermutations {

	
	static void permutation(String str, String ans){
		
		// System.out.print(ans + " ");
		 // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
		
		
		
		int len = str.length();
		
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			
			
			String ros =str.substring(0, i)+ str.substring(i+1);
			System.out.println("ros is "+ros);
			
			
			permutation(ros,ans+ch);
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringPermutations sp = new StringPermutations();
		String s="abc";
		permutation(s, "");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
