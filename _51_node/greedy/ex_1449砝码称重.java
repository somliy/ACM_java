package _51_node.greedy;

import java.util.Scanner;

public class ex_1449砝码称重 {
    /**
     * 1449 砝码称重
     * 1 秒  131,072 KB 40 分 4 级题
     * <p>
     * w进制算法，
     * 如果没有天平，只是这些砝码表示m的话，只需要将m表示成w进制数，然后要求每一位不是0就是1.(每个质量的砝码只有一个，要么放，要么不放)
     * <p>
     * 现在有这个天平，n这个数就是 两个 0 1 组成的数之差
     * 因为有借位问题，相差为1是可以的
     * 即只有下面四种情况：
     *
     * 0-0=0   1-0=1    0-1=w-1（向高位借一后）  1-1=0
     *
     * 分为三大类：
     *
     * 第一大类：相应位数之差为0  1的就很明了
     *
     * 第二大类：相应位数之差为w-1的，借位后的那一位在后面给它加上 1  就好了
     *
     * 第三大类：其余情况就是无解了
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int w = cin.nextInt();
        int n = cin.nextInt();
        boolean flag = true;
        while (n != 0) {
            if (n % w == 0 || n % w == 1) n /= w;
            else if ((n + 1) % w == 0) n = (n + 1) / w;
            else {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
