/**
 * 
 */
package arrays.bruteforce;

/**
 * @author maury
 *
 */
public class MountainArray {
	public boolean validMountainArray(int[] A) {
	     int i =0;
	        if(A.length<3)
	            return false;
	        boolean  increasing = A[1]>A[0];
	        if(!increasing) return false;
	        for( i = 1 ; i<A.length;i++){
	            
	            if(A[i]==A[i-1]) return false;
	        
	            if(increasing){
	                if(A[i]<A[i-1]) increasing =false;
	            } else{
	                if(A[i]>A[i-1]) return false;
	            }
	        }
	        return !increasing;
	            
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/**optimized solution remember it 
 * class Solution {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}
*/
