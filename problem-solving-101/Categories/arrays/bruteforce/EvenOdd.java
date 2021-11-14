/**
 * 
 */
package arrays.bruteforce;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maury
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	
	public static List<String> combinations(long high, long k) {
		if (high==0 || k==0)
		return new ArrayList<String>();
		if (k==1) {
		List<String> list = new ArrayList<String>();
		for (long i=1; i<=high; i++)
		list.add(String.valueOf(i));
		return list;
		}
		List<String> list = combinations(high-1,k);
		for (String s : combinations(high-1,k-1))
		list.add(s + high);
		return list;
		}
	
	public static long combinationsHelper(int high, int k) {
		List<String> list = combinations(high, k);
		System.out.println(list);
		return list.size();
		
	}
	public static void main(String[] args) {
		
		System.out.println(combinationsHelper(1000, 3));
		
}
}
