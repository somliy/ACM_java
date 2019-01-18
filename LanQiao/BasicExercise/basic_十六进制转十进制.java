package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/17 22:59
 * @Description:
 */
public class basic_十六进制转十进制 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        Long ans = Long.parseLong(str, 16);
        System.out.println(ans);
    }
}
