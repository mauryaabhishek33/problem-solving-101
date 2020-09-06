/**
 * 
 */
package arrays;

/**
 * @author maury
 *
 */
public class RemoveDuplicatesFromSortedArray {

	/**
	 * @param args
	 * optimized solution same as that of leetcode 
	 * not remember when done it probably after seeing solution
	 * key concept is to remember array is sorted, and then assume that first element seen is unique
	 * use two pointer approach, i is fast pointer that iterates over an array 
	 * j is slow pointer that modifies as per condition 
	 * now if we find a unique value then copy the unique value to index of slow pointer and increment 
	 *  slow pointer 
	 *  otherwise bypass the duplicates 
	 *  the question is with respect of array and doing inplace operation
	 *  note that  no duplicates are removed just returning length of an array which contains unique 
	 *  elements
	 */
	public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;  
        int j=1, unique=nums[0];
        for(int i=1; i<nums.length; i++){
           if(nums[i]!=unique){
               nums[j]=nums[i];
               unique =nums[i];
               j++;
           }
    }
        return j;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
