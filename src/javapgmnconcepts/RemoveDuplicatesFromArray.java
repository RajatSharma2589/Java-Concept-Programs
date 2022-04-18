package javapgmnconcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	
	
	public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together      
        Arrays.sort(numbersWithDuplicates);     
      
        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }

	public static void main(String[] args) {
		
		/*int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
        	Arrays.sort(removeDuplicates(input));
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
            
        }*/
		/*================================================================
*/
		/*int[]arr={1,2,3,1,1,3,5,5,6,8};
		//Arrays.sort(arr);
		//System.out.println();
		for(int i=0; i<arr.length; i++){
			
			for(int j=i+1;j<arr.length;j++)
		
		if(arr[i]==arr[j])
		{
			
		System.out.println("Duplicate = " +arr[j]);
		}
		}
*/
	/*	==============================================================================
	*/	
		int[]arr={1,2,3,1,1,3,5,5,6,8};
		//Arrays.sort(arr);
		//System.out.println();
		Set<Integer> setArr = new HashSet<Integer>();
		
		int count =0;
		for(int ele : arr)
		{
			if (setArr.add(ele)==false)
			{
				count++;
				System.out.println(ele);
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
