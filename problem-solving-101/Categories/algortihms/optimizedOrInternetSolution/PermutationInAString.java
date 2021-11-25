/**
 * 
 */
package algortihms.optimizedOrInternetSolution;

/**
 * @author maury
 *
 */
public class PermutationInAString {

	public static boolean checkInclusion(String s1, String s2) {
		int l1 = s1.length(), l2 = s2.length();
		if (l2 < l1)
			return false;
		long hash1 = 0;
		for (char ch : s1.toCharArray())
			hash1 += (ch * (ch - 96));
		char[] chars = s2.toCharArray();
		long hash2 = 0;
		for (int i = 0; i < l1; i++)
			hash2 += (chars[i] * (chars[i] - 96));
		if (hash2 == hash1)
			return true;
		for (int i = l1; i < l2; i++) {
			hash2 -= (chars[i - l1] * (chars[i - l1] - 96));
			hash2 += (chars[i] * (chars[i] - 96));
			if (hash2 == hash1)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkInclusion("hello", "eeelloooelohl"));

	}
}
