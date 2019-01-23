package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 19:59
 * @Description:
 */
public class basic_字符串对比 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str1 = cin.nextLine();
        String str2 = cin.nextLine();
        if (str1.length() != str2.length()) System.out.println(1);
        else if (str1.equals(str2)) System.out.println(2);
        else if (str1.toLowerCase().equals(str2.toLowerCase())) System.out.println(3);
        else System.out.println(4);
    }
}
