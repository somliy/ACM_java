package LanQiao.BasicExercise;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 16:23
 * @Description:
 */
public class basic_高精度加法 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigDecimal a = cin.nextBigDecimal();
        BigDecimal b = cin.nextBigDecimal();
        System.out.println(a.add(b));
    }
}
