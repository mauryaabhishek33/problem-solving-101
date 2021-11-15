/**
 * 
 */
package algortihms.binarySearch;

/**
 * @author maury Binary Search implementation : Array can be sorted overflow
 *         issue try to recognize different versions of binary search
 */
public class BinarySearchAlgorithm {

	public static int binarySearch(int nums[], int target) {
		int low = 0, high = nums.length;
		int mid;
		while (low < high) {
			mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] < target) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
