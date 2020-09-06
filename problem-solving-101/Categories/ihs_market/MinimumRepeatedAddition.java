/**
 * 
 */
package ihs_market;

/**
 * @author maury
 *
 */
public class MinimumRepeatedAddition {
	static int INF = Integer.MAX_VALUE;
	static int max_size = 100007;
	static int dp[] =  new int [max_size];
	static int min_op(int cur, int M) {
		if (cur> M)
			return INF;
		if(cur == M)
			return 0;
		
		if(dp[cur]!=-1)
			return dp[cur];
		int op =INF;
		for(int i = 2 ; i*i <=cur;i++) {
			if(cur % i == 0) {
				if(i%2 == 0) {
					op = Math.min(op, 1 + min_op(cur+ i, M));
				}
			}
		}
		return dp[cur]=op;
	}
	static int min_operations (int N, int M) {
		for(int i= N ; i<=M ; i++) {
			dp[i]=-1;
		}
		return min_op(N,M);
	}
	public static void main(String[] args) {
		

	}

}
