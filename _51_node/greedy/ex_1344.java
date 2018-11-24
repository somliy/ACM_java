package _51_node.greedy;

import java.io.*;

/**
 * 1344走格子
 */
public class ex_1344 {
    public static void main(String[] args) throws IOException {
        /*
        Scanner cin = new Scanner(System.in);
        long n = cin.nextInt();
        long ans = 0, minn = 1000000005;
        for(int i = 1; i <= n; i++) {
            ans += cin.nextInt();
            minn = Math.min(minn,ans);
        }
        if(minn >= 0) System.out.println(0);
        else System.out.println(-minn);
        */

        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        BufferedWriter cout = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);
        int n = Integer.parseInt(cin.readLine());
        long sum = 0, ans = 0;
        for (int i = 1; i <= n; i++) {
            sum += Integer.parseInt(cin.readLine());
            ans = Math.min(ans, sum);
        }
        cout.write(-ans + "");
        cout.flush();
    }
}
