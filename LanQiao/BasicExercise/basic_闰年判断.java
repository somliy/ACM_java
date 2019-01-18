package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/17 22:49
 * @Description:
 */
public class basic_闰年判断 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int year = cin.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("yes");
        else System.out.println("no");
    }

}
