/**
 * 
 */
package arrays.bruteforce;

/**
 * @author maury
 *
 */
public class MoveZeroes {

	/**
	 * @param args
	 * optimized solution 
	 */
	
	class Solution {
	    public void moveZeroes(int[] nums) {
	        int N =nums.length;
	        int writePointer=0;
	        for(int readPointer =0 ;readPointer<N; readPointer++)
	        {
	            if (nums[readPointer]!=0)
	            {
	                nums[writePointer++]=nums[readPointer];
	            }
	        }
	        
	        for(int remainingIndex = writePointer; remainingIndex<N; remainingIndex++){
	            nums[remainingIndex]=0;
	        }
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
