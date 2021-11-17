/**
 * 
 */
package algortihms.twoPointers;

/**
 * @author maury
 *
 *         recognized two pointer approach just stuck on a silly else condition
 *         checked it via eclipse not seen any solution
 */
public class MoveZeroesToRight {
	public static void moveZeroes(int[] nums) {
		if (nums.length == 1) {
			return;
		}
		int slowPointer = 0;
		int fastPointer = 0;
		while (fastPointer < nums.length) {
			if (nums[fastPointer] != 0) {
				nums[slowPointer] = nums[fastPointer];
				slowPointer++;
				fastPointer++;
			} else {
				fastPointer++;
			}
		}
		for (int i = slowPointer; i < nums.length; i++) {
			nums[i] = 0;
		}

	}

	public static void main(String[] args) {
		int nums[] = {0, 1, 0, 3, 12};
		moveZeroes(nums);
		System.out.println(nums);
	}
}
