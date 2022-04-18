package javapgmnconcepts;

public class SelectionSort {
	
	
	public static void main(String arg[])
	{
		
		int a[]= {5,45,2,1,99,56};
			
		int n= a.length;
		//System.out.println(n);
		
		int i,j,temp;
		
		for(i=0; i<n;i++)
		{
			int pos=i;
		//System.out.println("pos value in i loop: "+pos);
		//	System.out.println("i value: "+i);
			for( j=i+1; j<n; j++)
			{
			//	System.out.println("j value: "+j);
				if(a[j] < a[pos])
				{
					pos=j;
				}
			}
			
			temp = a[i];
			a[i]=a[pos];
			a[pos]= temp;
			
			
		}
		System.out.println("smallest number is "+a[n-i]);
		
	}

}
