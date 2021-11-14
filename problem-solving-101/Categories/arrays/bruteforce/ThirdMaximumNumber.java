/**
 * 
 */
package arrays.bruteforce;

/**
 * @author maury
 *
 */
public class ThirdMaximumNumber {

	/**
	 * @param args
	 */
	public int thirdMax(int[] a) {
        long fl=Long.MIN_VALUE,sl=Long.MIN_VALUE,tl=Long.MIN_VALUE;

 for(int i=0;i<a.length;i++){
     if(fl<a[i]){
     tl=sl;
     sl=fl;
     fl=a[i];
    
     }
     else if(a[i]<fl && sl<a[i]){
        
         tl=sl;
     sl=a[i];
     }
     else if(a[i]<sl && tl<a[i]){
     tl=a[i];
        
     }
 }
 

   return (int)(tl==Long.MIN_VALUE?fl:tl);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
