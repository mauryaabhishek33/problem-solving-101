import java.util.Arrays;
import java.util.Scanner;

class TCSCodeVitaC { 
  
	static long count =0;
	static long MOD =1000000007;
   
    static void CombinationRepetitionUtil(long chosen[], long arr[], 
            long index, long r, long start, long end) { 
        if (index == r) { 
        	long sum=0;
            for (long i = 0; i < r; i++) {
            	sum+=arr[(int) chosen[(int) i]];
             
            }
            if (sum%2==0)
            	count=(count+1)%MOD;
           
            return; 
        } 
  
     
        for (long i = start; i <=end; i++) { 
            chosen[(int) index] = i; 
            CombinationRepetitionUtil(chosen, arr, index + 1, r, i, end);
    
        } 
       
        return; 
    }  
    static void CombinationRepetition(long arr[], long n, long r) { 

        long chosen[] = new long[(int) (r + 1)]; 
 
        CombinationRepetitionUtil(chosen, arr, 0, r, 0, n - 1); 
    } 
 
    public static void main(String[] args) { 
        long low,high,k;
		int j=0;
        
       Scanner scan = new Scanner(System.in);
       low=scan.nextLong();
       high=scan.nextLong();
       k =scan.nextLong();
       long[] arr = new long [(int)(high-low+1)];
       for(long i=high;i>=low;i--) {
    	   arr[j]=i;
         j++;
       }
        long n = arr.length; 
        CombinationRepetition(arr, n, k); 
        Arrays.sort(arr);
        CombinationRepetition(arr, n, k);
        
        System.out.println(count-n);
        
    } 
} 
  