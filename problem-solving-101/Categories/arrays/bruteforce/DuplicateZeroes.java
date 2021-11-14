/**
 * 
 */
package arrays.bruteforce;

/**
 * @author maury
 *
 */
public class DuplicateZeroes {

	/**
	 * @param args
	 */
	 public void duplicateZeros(int[] arr) {
	     
		 int zeroCount= 0;
		 int length = arr.length-1;
		 
		 // for calculating number of extra zereos and new length  after removing discarded elements
		 // and meeting boundary case where 0 is in boundary of new array
		 //so that it is not counted twice
		 for(int i =0 ;i<=length;i++) {
			 if(arr[i]==0) {
				 if(i==length-zeroCount) {
					 arr[length]=0;
					 length--;
					 break;
				 }
				 zeroCount++;
			 }
		 }
		 int last = length-zeroCount;
		 //copying twice if 0 is present to new index of empty spaces
		 
		 for (int i=last ; i>=0;i--) {
			 if(arr[i]==0) {
				 //copy twice
				 arr[i+zeroCount]=0;
				 zeroCount--;
				 arr[i+zeroCount]=0;
			 }
			 else {
				 arr[i+zeroCount]=arr[i];
			 }
		 }
		 
		 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateZeroes duplicateZereos = new DuplicateZeroes();
		
		int arr [] = {8,4,5,0,0,0,0,7};
		
		duplicateZereos.duplicateZeros(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i] + " ");
		}
	}

}
