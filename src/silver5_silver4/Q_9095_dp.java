package silver5_silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_9095 {

    public static int[] dp = new int[12];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        dpFunc();
        for (int i = 0; i < count; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]+"\n");
        }
        System.out.println(sb);

    }

    private static void dpFunc() {
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < 11; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
    }
}
