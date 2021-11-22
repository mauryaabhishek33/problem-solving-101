/**
 * 
 */
package algortihms.slidingWindow;

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

	public static int lengthOfLongestSubstring(final String s) {
		int length = 0;
		int asciiArray[] = new int[256];

		for (int rightWindow = 0, leftWindow = 0; rightWindow < s
				.length(); rightWindow++) {
			leftWindow = (asciiArray[s.charAt(rightWindow)] > 0)
					? Math.max(leftWindow, asciiArray[s.charAt(rightWindow)])
					: leftWindow;
			asciiArray[s.charAt(rightWindow)] = rightWindow + 1;
			length = Math.max(length, rightWindow - leftWindow + 1);

		}

		return length;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));

	}

}
