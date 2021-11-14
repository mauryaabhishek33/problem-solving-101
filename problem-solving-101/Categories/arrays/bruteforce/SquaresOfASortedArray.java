/**
 * 
 */
package arrays.bruteforce;

import java.util.Arrays;

/**
 * @author maury
 *
 */
public class SquaresOfASortedArray {

	public int[] sortedSquares(int[] A) {
        for(int i =0;i<A.length;i++)
            A[i]=A[i]*A[i];
        Arrays.sort(A);
		return A;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {-7,-3,2,3,11};
		SquaresOfASortedArray sorted= new SquaresOfASortedArray();
		nums = sorted.sortedSquares(nums);
		for(int i : nums) {
			System.out.println(i);
	}

}
}
