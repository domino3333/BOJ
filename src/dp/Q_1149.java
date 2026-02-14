package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/1149
public class Q_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int homeCount = Integer.parseInt(br.readLine());

        int[][] cost = new int[homeCount+1][3];
        int[][] dp = new int[homeCount+1][3];

        for (int i = 1; i <= homeCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }

        // 첫번째 집을 Red로 칠했을때의 비용
        dp[1][0] = cost[1][0];
        // 첫번째 집을 green으로 칠했을 때의 비용
        dp[1][1] = cost[1][1];
        // 첫번째 집을 blue으로 칠했을 때의 비용
        dp[1][2] = cost[1][2];

        for (int i = 2; i <= homeCount; i++) {
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][1], dp[i - 1][0]);
        }

        int result = Math.min(dp[homeCount][0],(Math.min(dp[homeCount][1],dp[homeCount][2])));

        System.out.println(result);

    }
}
