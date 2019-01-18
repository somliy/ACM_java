package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/17 22:50
 * @Description:
 */
public class basic_十进制转十六进制 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(Integer.toHexString(n).toUpperCase());
    }
}
