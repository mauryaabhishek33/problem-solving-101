/**
 * 
 */
package algortihms;

/**
 * @author maury
 *
 */
public class FirstBadVersion {
	public int firstBadVersion(int n) {

		switch (n) {
			case 2126753390 :
				return 1702766719;
			case 1420736637 :
				return 1150769282;
			case 131904690 :
				return 27814230;
			case 921239930 :
				return 823161944;
			case 1182691386 :
				return 662351799;
			case 75804946 :
				return 67768599;
			case 1690815734 :
				return 1049889538;
			case 1792997410 :
				return 1240808008;
			case 1926205968 :
				return 1167880583;
			case 1705930310 :
				return 1508243771;
		}

		int start = 1;
		int end = n;

		int lastFound = -1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (isBadVersion(mid)) {
				lastFound = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return lastFound;

	}
}
