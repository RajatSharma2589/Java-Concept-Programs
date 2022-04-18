package javapgmnconcepts;

public class BubbleSort {

	
	public static void sort(int[]arr)
	{
		
		int  n = arr.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
	
	}
	
	public static void print(int[]arr)
	{
		int  n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs = new BubbleSort();
		int [] ar = {10,3,5,2,45,0};
		sort(ar);
		print(ar);

	}

}
