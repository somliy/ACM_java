package LanQiao.BasicExercise;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 18:08
 * @Description:
 */
public class basic_回文数 {
    /**
     * 基础练习 回文数
     * 描述
     *
     * 1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 按从小到大的顺序输出满足条件的四位十进制数。
     *
     * 输入样例:
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出样例:
     *
     * 思路： 直接输出
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println("" + i + j + j + i);
            }
        }
    }

}
