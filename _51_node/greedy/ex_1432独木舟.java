package _51_node.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ex_1432独木舟 {
    /**
     * 1432 独木舟
     * 1 秒  131,072 KB 10 分 2 级题
     * n个人，已知每个人体重。独木舟承重固定，每只独木舟最多坐两个人，可以坐一个人或者两个人。显然要求总重量不超过独木舟承重，假设每个人体重也不超过独木舟承重，问最少需要几只独木舟？
     * 输入
     * 第一行包含两个正整数n (0<n<=10000)和m (0<m<=2000000000)，表示人数和独木舟的承重。
     * 接下来n行，每行一个正整数，表示每个人的体重。体重不超过1000000000，并且每个人的体重不超过m。
     * 输出
     * 一行一个整数表示最少需要的独木舟数。
     * 输入样例
     * 3 6
     * 1
     * 2
     * 3
     * 输出样例
     * 2
     *
     * 思路： 最重的与最轻的匹配，超过最大承重，那么只能自己一个人乘一只，最终匹配完成记录数量即可
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        Arrays.sort(a);
        int i = 0, j = n - 1, ans = 0;
        while (i <= j) {
            if (a[j] + a[i] > m) {
                j--;
                ans++;
            } else {
                ans++;
                i++;
                j--;
            }
        }
        System.out.println(ans);
    }
}
