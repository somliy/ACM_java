package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 14:46
 * @Description:
 */
public class basic_完美的代价 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, flag = 0, ans = 0, index = 0;
        n = Integer.valueOf(cin.nextLine());
        char[] str = cin.nextLine().toCharArray();
        int len = n - 1;
        for (int i = 0; i < len; i++) {
            for (int j = len; j >= 0; j--) {
                if (j == i) {
                    flag++;
                    if (n % 2 == 0 || flag > 1) {
                        System.out.println("Impossible");
                        return;
                    }
                    index = n / 2 - i;
                    break;
                } else if (str[j] == str[i]) {
                    ans += len - j;
                    for (int k = j; k < len; k++) {
                        str[k] = str[k + 1];
                    }
                    str[len] = str[i];
                    len--;
                    break;
                }
            }
        }
        System.out.println(ans + index);
    }
}
