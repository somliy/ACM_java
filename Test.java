import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/23 10:27
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        //PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int a, b, c;
        while (in.nextToken() != StreamTokenizer.TT_EOF) {
            a = (int) in.nval;
            in.nextToken();
            b = (int) in.nval;
            in.nextToken();
            c = (int) in.nval;
            //out.println(a + b);
            System.out.println("a + b + c = " + (a + b+c));
        }
        //out.flush();
    }
}
