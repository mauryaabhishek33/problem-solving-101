/**
 * 
 */
package arrays;

/**
 * @author maury
 *
 */
public class SortArrayByParity {

	/**
	 * @param args
	 * optimized solution by myself in one attempt 
	 */
	public int[] sortArrayByParity(int[] A) {
        int tail =A.length-1,current_index=0,temp;
        while(current_index<tail)
        {
            if(A[current_index]%2!=0)
            {
                temp=A[current_index];
                A[current_index]=A[tail];
                A[tail]=temp;
                tail--;
            }
            else{
                current_index++;
            }
            
        }
        return A;
    }
	
	/** 0 ms solution 
	 * public int[] sortArrayByParity(int[] A) {
        int s = 0;
        int e = A.length-1;
        int temp;
        while(s < e){
            if((A[s] & 1) == 1) {
                if((A[e] & 1) == 0){
                    temp = A[s];
                    A[s++] = A[e];
                    A[e--] = temp;
                }
                else
                    e--;
            }
            else{
                s++;
            }
        }
        
        return A;
    }
	 * @param args using custom comparator O(NlogN) time complexity and O(N) space
	 *  public int[] sortArrayByParity(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];
			notice the use of parity bits 1 for odd and 0 for even and then comparing them
			nice technique
        Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

        for (int t = 0; t < A.length; ++t)
            A[t] = B[t];
        return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */
 
	/**
	 * 
	 * use of parity in real terms 
	 * We'll maintain two pointers i and j. The loop invariant is everything below i has parity 0 
	 * (ie. A[k] % 2 == 0 when k < i), and everything above j has parity 1.

Then, there are 4 cases for (A[i] % 2, A[j] % 2):

If it is (0, 1), then everything is correct: i++ and j--.

If it is (1, 0), we swap them so they are correct, then continue.

If it is (0, 0), only the i place is correct, so we i++ and continue.

If it is (1, 1), only the j place is correct, so we j-- and continue.

Throughout all 4 cases, the loop invariant is maintained, and j-i is getting smaller.
 So eventually we will be done with the array sorted as desired.
	 * public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
