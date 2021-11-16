/**
 * 
 */
package algortihms.binarySearch;

/**
 * @author maury
 *
 */
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length - 1, mid;
		while (low < high) {
		}
		mid = low + (high - low) / 2;
		if (nums[mid] == target) {
			return mid;
		}
		if (nums[mid] > target) {
			high = mid;
		} else {
			low = mid + 1;
		}
		return low;
	}
}
