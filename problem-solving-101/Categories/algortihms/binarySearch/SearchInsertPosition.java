/**
 * 
 */
package algortihms.binarySearch;

/**
 * @author maury
 *
 */
public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length, mid;
		while (low < high) {
			mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] > target) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 6};
		System.out.println(searchInsert(arr, 5));
		// TODO Auto-generated method stub

	}
}
