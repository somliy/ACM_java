package LanQiao.BasicExercise;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 14:49
 * @Description:
 */
public class basic_01字串 {
    /**
     * 基础练习 01字串
     * 描述
     *
     * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
     *
     * 00000
     *
     * 00001
     *
     * 00010
     *
     * 00011
     *
     * 00100
     *
     * 请按从小到大的顺序输出这32种01串。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 本试题没有输入。
     *
     * 输入样例:
     *
     * 00000
     *
     * 00001
     *
     * 00010
     *
     * 00011
     *
     * <以下部分省略>
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出32行，按从小到大的顺序每行一个长度为5的01串。
     *
     * 思路：模拟输出，for循环即可
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int a = 0; a <= 1; a++) {
            for (int b = 0; b <= 1; b++) {
                for (int c = 0; c <= 1; c++) {
                    for (int d = 0; d <= 1; d++) {
                        for (int e = 0; e <= 1; e++) {
                            System.out.println("" + a + b + c + d + e);
                        }
                    }
                }
            }
        }
    }
}
