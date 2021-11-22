/**
 * 
 */
package algortihms.optimizedOrInternetSolution;

/**
 * @author maury
 * 
 *         Not keeping attention to details , as it was already written that
 *         string can be only ascii values hence should have thought of
 *         Hashtable or a cache array of fixed size, as unique character
 *         constraint can only be solved like this, took 2 hours and havent came
 *         up with solution, need more practice :(
 *
 */
public class LongestCommonSubstring {

	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int leftIndex = 0;
		int rightIndex = 0;
		int result = 1;
		char[] sc = s.toCharArray();
		while (rightIndex < sc.length) {
			for (int j = leftIndex; j < rightIndex; j++) {
				if (sc[rightIndex] == sc[j]) {
					leftIndex = j + 1;
					break;
				}
			}
			result = Math.max(rightIndex - leftIndex + 1, result);
			rightIndex++;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));

	}

}
