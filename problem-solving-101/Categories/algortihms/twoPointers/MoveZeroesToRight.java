/**
 * 
 */
package algortihms.twoPointers;

import java.util.Arrays;
import java.util.HashMap;

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

	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			int count = map.getOrDefault(i, 0);
			if (count >= 2) {
				return true;
			}
			map.put(i, count + 1);
		}
		return false;
	}

	public static int[] twoSum(int[] numbers, int target) {
		int arr[] = new int[2];
		for (int i = 0; i < numbers.length; i++) {

		}
		return arr;
	}
	public static void main(String[] args) {
		int nums[] = {3, 24, 50, 79, 88, 150, 345};
		System.out.println(Arrays.toString(twoSum(nums, 200)));
	}
}
