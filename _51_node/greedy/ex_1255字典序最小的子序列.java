package _51_node.greedy;

import java.util.Scanner;
import java.util.Stack;

public class ex_1255字典序最小的子序列 {
    /**
     * 1255 字典序最小的子序列
     * 1 秒  131,072 KB 40 分 4 级题
     * 给出一个由a-z组成的字符串S，求他的一个子序列，满足如下条件：
     *
     * 1、包含字符串中所有出现过的字符各1个。
     * 2、是所有满足条件1的串中，字典序最小的。
     *
     * 例如：babbdcc，出现过的字符为：abcd，而包含abcd的所有子序列中，字典序最小的为abdc。
     * 输入
     * 输入1行字符串S，所有字符均为小写，字符串的长度为L。(1 <= L <= 100000)。
     * 输出
     * 输出包含S中所有出现过的字符，每个字符各1个，并且字典序最小的S的子序列。
     * 输入样例
     * babbdcc
     * 输出样例
     * abdc
     *
     * 维护一个栈，3种操作，
     * 1、如果栈顶ch1 > 输入字母ch2，并且ch1后面还出现，并且栈里没有ch2，则加入栈
     * 2、如果栈里没有这个字母，那么入栈
     * 3、如果相同，或者已经在栈里，不入栈
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        int[] arr = new int[26];
        int[] bool = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'a']++;
            bool[ch - 'a'] = 0;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        arr[str.charAt(0) - 'a']--;
        bool[str.charAt(0) - 'a'] = 1;
        for (int i = 1; i < str.length(); i++) {
            char ch1 = stack.peek();
            char ch2 = str.charAt(i);
            if (arr[ch1 - 'a'] >= 1 && ch2 < ch1 && bool[ch2 - 'a'] == 0) {
                stack.pop();
                bool[ch1 - 'a'] = 0;
                while(!stack.empty()) {
                    ch1 = stack.peek();
                    if(ch1 > ch2 && arr[ch1 - 'a'] >= 1 ) {
                        stack.pop();
                        bool[ch1 - 'a'] = 0;
                    }else break;
                }
                stack.push(ch2);
                bool[ch2 - 'a'] = 1;
                arr[ch2 - 'a']--;
            }else if(bool[ch2 - 'a'] == 0) {
                bool[ch2 - 'a'] = 1;
                stack.push(ch2);
                arr[ch2-'a']--;
            }else if (ch1 == ch2 || bool[ch2 - 'a'] == 1) {
                arr[ch2 - 'a']--;
            }
        }
        String s = "";
        while (!stack.empty()) {
            s += stack.pop();
        }
        System.out.println(new StringBuilder(s).reverse().toString());
    }
}
