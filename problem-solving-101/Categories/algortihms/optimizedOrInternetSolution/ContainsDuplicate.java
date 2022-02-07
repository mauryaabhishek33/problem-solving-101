/**
 * 
 */
package algortihms.optimizedOrInternetSolution;

/**
 * @author maury
 *
 */
public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		// sort it then find consecutive O(nlogn)-->brute force
		// count arr
		if (nums.length > 1 && nums[0] == nums[1]) {
			return true;
		}
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num > maxNum) {
				maxNum = num;
			}
			if (num < minNum) {
				minNum = num;
			}
		}
		boolean[] arr = new boolean[(maxNum - minNum) + 1];
		for (int i = 0; i < nums.length; i++) {
			if (arr[(nums[i] - minNum)]) {
				return true;
			}
			arr[(nums[i] - minNum)] = true;
		}
		return false;

	}

	public static void main(String args[]) {
		int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		System.out.println(containsDuplicate(arr));
	}
}
