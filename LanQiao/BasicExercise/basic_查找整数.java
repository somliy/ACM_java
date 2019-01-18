package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 17:53
 * @Description:
 */
public class basic_查找整数 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int ans = -1;
        int x = cin.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                ans = i + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
