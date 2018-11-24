package _51_node.greedy;

import java.io.*;
import java.util.Arrays;

/**
 * 1182 完美字符串
 */
public class ex_1182 {
    public static void main(String[] args) throws IOException {
        /**
         * 数组

        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        str = str.toLowerCase();
        int ans = 0;
        int[] s = new int[27];
        for (int i = 0; i < str.length(); i++) {
            s[(int) str.charAt(i) - (int) 'a']++;
        }
        Arrays.sort(s);
        for (int i = 26; i >= 0; i--) {
            ans += i * s[i];
        }
        System.out.println(ans);

         */

        StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in), 1 << 16));
        PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
        cin.nextToken();
        String s = cin.sval.toLowerCase();
        int[] str = new int[26];
        for (int i = 0; i < s.length(); i++) {
            str[s.charAt(i) - 'a']++;
        }
        Arrays.sort(str);
        int ans = 0;
        for (int i = 25; i >= 0; i--) {
            ans += (i + 1) * str[i];
            if (str[i] == 0) break;
        }
        cout.println(ans);
        cout.flush();
    }
}

