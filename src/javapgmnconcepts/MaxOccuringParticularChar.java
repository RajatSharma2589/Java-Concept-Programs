package javapgmnconcepts;

public class MaxOccuringParticularChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//-------Method 1------------------ 
		String str ="AUTOMATION";
		int len = str.length();
		char[] ch = str.toCharArray();
		
		int count =0;
		
		for(char chr : ch){
			
			if(chr =='O')
			{
				count++;
			
			}
			
		}
		System.out.println("no of char "+count);
	}

}


//--------Method 2-------------

/*String str ="AUTOMATION";
int len = str.length();

int count =0;

for(int i=0;i<len;i++){
	
	if(str.charAt(i)=='O')
	{
		count++;
	
	}
	
}
System.out.println("no of char "+count);
*/

