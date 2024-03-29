/**
 * 
 */
package arrays.bruteforce;

/**
 * @author maury
 *
 */
public class CountNumberOfConsecutive1sInBinaryArray {
	
	public int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to 
        // keep track of how many 1's you've seen in a row.
		
		int counter= 0,max_counter=0;
        for (int i = 0; i < nums.length; i++) {
            // Do something with element nums[i].
        	if(nums[i]==1)
        		counter++;
        	else
        	{	
        		max_counter= Math.max(counter, max_counter);
        		counter=0;
        	}
        }
		return Math.max(counter, max_counter);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNumberOfConsecutive1sInBinaryArray count = new CountNumberOfConsecutive1sInBinaryArray();
		
		int nums[]= {0,1,0,1,1,1,1,1,1,0,1,0,0,0,0,0,1,1,1,1,0};
		
		System.out.println(count.findMaxConsecutiveOnes(nums));

	}

}
