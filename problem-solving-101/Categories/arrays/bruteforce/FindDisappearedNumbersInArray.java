/**
 * 
 */
package arrays.bruteforce;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maury
 *
 */
public class FindDisappearedNumbersInArray {

	/**
	 * @param args
	 */
	public List<Integer> findDisappearedNumbers(int[] nums) {
		
		List<Integer> list  = new ArrayList<>();
		
		int n = nums.length;
		
		int index = 0 ;
		
		for (int i = 0 ;i<nums.length; i++) {
			index = nums[i];
			nums[(index-1)%n]+= n;
		}
		
		for(int i =0; i< nums.length; i++) {
			if(nums[i]>=n)	list.add(i+1);
		}
		
		return list;
        
    }
	public static void main(String[] args) {

	}

}
