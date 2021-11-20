/**
 * 
 */
package algortihms.twoPointers;

/**
 * @author maury
 *
 */
public class ReverseString {

	public static void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		char temp = ' ';
		while (left < right) {
			temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
		System.out.println(s);
		System.gc();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char s[] = {'h', 'e', 'l', 'l', 'o'};
		reverseString(s);
	}

}
