import java.util.Arrays;
import java.util.Map;

public class LargestSumSubarray {
    public static void main(String[] args) {
        long[] arr = {1,1,1,1,1,1};
        long k = 2;

        System.out.println(maxSumWithK(arr,arr.length,k));


    }
    static long maxSumWithK(long a[], long n, long k) {
        long[] dp = new long[(int) (n+1)];

        for (int i = (int) (n - 1); i >= 0; i--) {
            dp[i] = a[i] + dp[i + 1];
            dp[i] = Math.max(dp[i], 0L);
        }
        long Cursum = 0;
        long ans = Long.MIN_VALUE;

        for (long i = 0; i < k; i++) {
            Cursum = Cursum + a[(int) i];
        }
        for (long i = k; i < n; i++) {
            long sum = Cursum + dp[(int) (i )];
            ans = Math.max(ans,sum);
            Cursum = Cursum + a[(int) i];
            Cursum = Cursum - a[(int) (i - k)];
        }
        return Math.max(ans,Cursum);

    }

}
