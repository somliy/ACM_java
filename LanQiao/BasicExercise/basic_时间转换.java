package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 19:55
 * @Description:
 */
public class basic_时间转换 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int h = n / 3600;
        int m = (n - h * 3600) / 60;
        int s = n % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
