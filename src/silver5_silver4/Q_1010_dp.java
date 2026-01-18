package silver5_silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1010_dp {


    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            System.out.println(combination(m, n));

        }
    }

    public static int combination(int n, int r) {
        if (dp[n][r] > 0) return dp[n][r];
        if (n == r || r == 0) {
            dp[n][r] = 1;
            return dp[n][r];
        }else {
            dp[n][r] = combination(n-1,r-1) + combination(n-1,r);
            return dp[n][r];
        }
    }


}
