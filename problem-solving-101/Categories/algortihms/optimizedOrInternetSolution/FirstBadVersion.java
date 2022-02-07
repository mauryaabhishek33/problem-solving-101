/**
 * 
 */
package algortihms.optimizedOrInternetSolution;

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
		int lv = 1, hv = n;

		while (lv < hv) {
			int v = (lv + hv) >>> 1; // use bitwise to reduce complexity

			if (isBadVersion(v)) {
				hv = v;
			} else {
				lv = v + 1;
			}
		}

		return lv;
	}

	static boolean isBadVersion(int n) {
		throw new IllegalStateException("no implementation");
	}
}
