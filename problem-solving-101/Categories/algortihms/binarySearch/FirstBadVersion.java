/**
 * 
 */
package algortihms.binarySearch;

/**
 * @author maury Classic variation of Binary search The catch is to identify
 *         binary search can be used. As we can do it linear time in brute force
 *         focus on point that once a version is bad then subsequent version all
 *         also bad (we can ignore further all values/iterations) thus once one
 *         version is bad, then version from 1 to this version ( suppose k )
 *         will only be containing first bad version hence we iterate till point
 *         we cross and when both boundaries meet then only it will be our first
 *         bad version, how to prove that it will only be a single elemen well
 *         our search space should reduce to 1 element only every time and proof
 *         through induction
 *         http://www.cs.cornell.edu/courses/cs211/2006sp/Lectures/L06-Induction/binary_search.html
 */
public class FirstBadVersion {
	public int firstBadVersion(int n) {
		int low = 1, high = n, mid;
		while (low < high) {
			mid = low + (high - low) / 2;
			if (isBadVersion(mid)) {
				high = mid - 1;
			} else {
				low = mid;
			}
		}
		return low;
	}

	static boolean isBadVersion(int n) {
		throw new IllegalStateException("no implementation");
	}
}
