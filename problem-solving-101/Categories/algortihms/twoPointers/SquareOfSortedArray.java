/**
 * 
 */
package algortihms.twoPointers;

/**
 * @author maury
 * 
 *         Took more than 1 hour to solve this question, after knowing that two
 *         pointer could be applied here, missed the part about space complexity
 *         unless specified specifically always ask if we can use extra space
 *         traded with O(n) ? was an easy one to practice two pointers, should
 *         be able to do it
 */
public class SquareOfSortedArray {
	public int[] sortedSquares(int[] nums) {
		int leftPointer = 0, rightPointer = nums.length - 1;
		int res[] = new int[nums.length];
		for (int i = nums.length - 1; i >= 0; i--) {
			if ((nums[leftPointer] * nums[leftPointer]) < (nums[rightPointer]
					* nums[rightPointer])) {
				res[i] = nums[rightPointer] * nums[rightPointer];
				rightPointer--;
			} else {
				res[i] = nums[leftPointer] * nums[leftPointer];
				leftPointer++;
			}
		}
		return res;
	}
}
