package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 17:05
 * @Description:
 */
public class basic_数列特征 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        for(int i = 1; i <= n; i++) {
            int x = cin.nextInt();
            sum += x;
            max = Math.max(max,x);
            min = Math.min(min,x);
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
