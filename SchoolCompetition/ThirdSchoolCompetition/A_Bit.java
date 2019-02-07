package SchoolCompetition.ThirdSchoolCompetition;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/9 12:19
 * @Description:
 */
public class A_Bit {
    /**
     * Description
     *
     * Bitland的经典编程语言是Bit++。这种语言是如此奇特和复杂。这种语言非常特别，因为它只有一个变量x。 Operation ++ 使变量x的值增加1。 Operation -- 运算——将变量x的值减少1。 Bit++语言中的语句是一个序列，由一个操作和一个变量x组成，语句没有空格，只能包含字符“+”、“-”、“x”。执行语句意味着应用它包含的操作。位++中的程序是一系列语句，每一个语句都需要执行。执行一个程序意味着执行它所包含的所有语句。你得到了一个用比特++语言编写的程序。x的初值是0。执行程序并找到它的最终值(程序执行时变量的值)。
     *
     *
     * Input
     *
     * 第一行包含一个整数n(1≤n≤150)。接下来的n行每一行都包含一条语句。每个语句恰好包含一个操作(++或--)和一个变量x(表示为字母«x»)。
     * 因此，不存在空语句。操作和变量可以按任何顺序写入。
     *
     *
     * Output
     *
     * 打印一个整数x的最终值。
     *
     *
     * Sample Input 1
     *
     * 1
     * ++X
     * 2
     * X++
     * --X
     * Sample Output 1
     *
     * 1
     * 0
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            int ans = 0;
            int x = cin.nextInt();
            String str = cin.nextLine();
            for(int i = 0; i < x; i++) {
                str = cin.nextLine();
                if(str.indexOf("++") >= 0) ans++;
                else ans--;
            }
            System.out.println(ans);
        }
    }
}
