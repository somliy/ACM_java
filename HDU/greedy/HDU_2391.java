package HDU.greedy;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/5 21:21
 * @Description:
 */
public class HDU_2391 {
    /**
     * 输出格式
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int c = cin.nextInt();
            for (int ca = 1; ca <= c; ca++) {
                int n = cin.nextInt();
                int m = cin.nextInt();
                int[][] mp = new int[n + 1][m + 1];
                int[][] dp = new int[n + 1][m + 1];
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        mp[i][j] = cin.nextInt();
                    }
                }
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j])
                                + mp[i][j];
                    }
                }

                System.out.println("Scenario #" + ca + ":");
                System.out.println(dp[n][m]);
                System.out.println();
            }
        }
    }
}
