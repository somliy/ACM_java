package LanQiao.BasicExercise;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 16:28
 * @Description:
 */
public class basic_阶乘计算 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        BigDecimal ans = new BigDecimal("1");
        for(int i = 2; i <= n; i++) {
            ans = ans.multiply(new BigDecimal(i));
        }
        System.out.println(ans);
    }
}
