import java.util.HashMap;

public class NewYearResolution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isPossible(5,arr));

    }
    static boolean isPossible(int N, int[] coins) {
        // code here
        int sum = 0;
        for (int coin : coins) {
            sum += coin;
        }
        if (sum % 24 == 0 || sum % 20 == 0 || sum == 2024){
            return true;
        }

        int[][] dp = new int[N + 1][sum+1];

        for (int i = 20; i < sum; i+=20) {
            dp[N][i] = 1;
        }

        for (int i = 24; i < sum; i+=24) {
            dp[N][i] = 1;
        }
        if (2024 <= sum){
            dp[N][2024] = 1;
        }

        for (int i = N - 1; i >=0; i--) {
            for (int j = 0; j <= sum; j++) {
                int take = 0;
                int noTake = 0;

                noTake = dp[i+1][j];

                if (coins[i] + j <= sum){
                    take = dp[i+1][j+coins[i]];


                }
                dp[i][j] = Math.max(take,noTake);
            }
        }
        return dp[0][0] == 1;


    }
}
