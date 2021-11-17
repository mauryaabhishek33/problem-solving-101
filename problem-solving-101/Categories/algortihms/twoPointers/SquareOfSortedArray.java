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
	public static void rotate(int[] nums, int k) {
		int temp = 0, n = nums.length - 1;
		for (int j = 1; j <= k; j++) {
			temp = nums[n];
			for (int i = n; i > 0; i--) {
				nums[i] = nums[i - 1];
			}
			nums[0] = temp;
			j++;
			System.out.println(nums);
		}
		System.out.println(nums);
	}

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7};
		rotate(a, 3);
	}
}
