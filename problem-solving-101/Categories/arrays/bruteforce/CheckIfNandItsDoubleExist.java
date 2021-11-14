/**
 * 
 */
package arrays.bruteforce;

import java.util.HashSet;

/**
 * @author maury
 *
 */
public class CheckIfNandItsDoubleExist {
	public static boolean checkIfExist(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i =0 ; i<arr.length ; i++ ){
            set.add(arr[i]);
        }
        
        for(int i = 0 ; i<arr.length; i++){
            if(set.contains(arr[i]*2) ){
            	System.out.println(arr[i]*2);
                return true;
            }
            if(set.contains(arr[i]/2) && arr[i]%2==0 && arr[i]!=0){
            	
            	System.out.println(arr[i]/2 + " " );
                return true;
            }
        }
        return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr [] = {-2,0,10,-19,4,6,-8};
		// TODO Auto-generated method stub
		System.out.println(checkIfExist(arr));

	}

}
/**
 * optimize solution  
 * class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            
            set.add(num);
        }
        
        return false;
    }
}*/

/** 
 * O(n^2) and space - o(1)
 * class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                if (linearSearch(arr, arr.length, arr[i] / 2, i)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean isEven(int num) {
        return (num & 1) == 0;
    }
    
    private boolean linearSearch(int[] array, int length, int element, int currentIndex) {
        // Check for edge cases
        if (array == null || length == 0) {
            return false;
        }

        // Check each element starting from the first one
        for (int i = 0; i < length; i++) {
            if (i == currentIndex) continue;
            // We found the element at index i, so return true.
            if (array[i] == element) {
                return true;
            }
        }

        // We didn't find the element in the array.
        return false;
    }
}*/
