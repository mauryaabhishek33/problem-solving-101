/**
 * 
 */
package algortihms.recursion;

import java.util.Arrays;

/**
 * @author maury
 *
 */
public class ReverseWordsInAString {

	public static String reverseWords(String s) {
		char charArray[] = s.toCharArray();
		int fastPointer = charArray.length - 1,
				slowPointer = charArray.length - 1;
		while (fastPointer != 0) {
			if (charArray[fastPointer] == ' ') {
				reverseString(charArray, fastPointer + 1, slowPointer);
				slowPointer = fastPointer - 1;
				fastPointer--;
			} else {
				fastPointer--;
			}
		}
		reverseString(charArray, fastPointer, slowPointer);
		return String.valueOf(charArray);
	}

	public static void reverseString(char[] s, int left, int right) {
		int l = left, r = right;
		int mid = l + (r - l) / 2;
		char temp = ' ';
		while (l < mid) {
			temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
		}
		System.out.println(Arrays.toString(s));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

}
