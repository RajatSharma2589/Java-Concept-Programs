package javapgmnconcepts;

public class PrintNumberInTriangle {

	public static void main(String[] args) {
		/*int n=0;
		 int x=1;
		 
		 for(int i=0;i<50;i++)
		 {
			 n=n+1;
			 x= n*(n+1)/2;
			 System.out.println(x);
		 }*/
		
		//floyds Triangle
		
		int num=1;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
