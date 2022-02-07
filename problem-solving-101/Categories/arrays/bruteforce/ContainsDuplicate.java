/**
 * 
 */
package arrays.bruteforce;

import java.util.HashMap;

/**
 * @author maury
 *
 */
public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (Integer i : nums) {
			int numberOfTimes = hashMap.getOrDefault(i, 0);
			if (numberOfTimes != 0) {
				hashMap.put(i, numberOfTimes + 1);
			} else {
				hashMap.put(i, 1);
			}
		}
		return hashMap.values().stream()
				.anyMatch(numberOftimes -> numberOftimes >= 2);
	}

	public static void main(String args[]) {
		int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		System.out.println(containsDuplicate(arr));
	}
}
