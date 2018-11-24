package _51_node.greedy;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 1432 独木舟
 * */
public class ex_1432 {
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
