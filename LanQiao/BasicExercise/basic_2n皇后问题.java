package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/25 21:46
 * @Description:
 */
public class basic_2n皇后问题 { static int n, count = 0;
    static int map[][];

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        map = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                map[i][j] = cin.nextInt();
        Put(0, 2);
        System.out.println(count);
    }

    public static void Put(int t, int s) {
        if (t == n) {
            if (s == 2) Put(0, 3);
            else count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (map[t][i] != 1) continue;
            if (Check(t, i, s)) {
                map[t][i] = s;
            } else continue;
            Put(t + 1, s);
            map[t][i] = 1;
        }
        return;
    }

    public static boolean Check(int t, int i, int s) {
        for (int q = t - 1; q >= 0; q--) {
            if (map[q][i] == s) return false;
        }
        for (int q = t - 1, w = i - 1; q >= 0 && w >= 0; q--, w--) {
            if (map[q][w] == s) return false;
        }
        for (int q = t - 1, w = i + 1; q >= 0 && w <= n - 1; q--, w++) {
            if (map[q][w] == s) return false;
        }
        return true;
    }
}