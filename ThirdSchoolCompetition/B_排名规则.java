package ThirdSchoolCompetition;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/9 12:33
 * @Description:
 */
public class B_排名规则 {
    /**
     * Description
     *
     * 我们在ACM的题目中已经了解了什么是ACM了，ACM还是很残酷的了（ಥ _ ಥ），那么现在你就要解决一个ACM最简单的题了，简单到省赛和区域赛都不会出这种简单的题。ls很强，即使每年都在ACM这个大坑里，但是他依旧关心自己的排名。但是排名规则真的很令人烦恼，因为它是按平均分排的并且他们学习的科目数量是不一定的。所以你的任务就来了，ls的班里有n名同学，每个同学有3门课程，现在你要根据他们的成绩总和从大到小排名如果成绩相同则按他们名字的字典序（字典序当然就是字典的顺序啦）排名。
     *
     *
     * Input
     *
     * 第1行：一个数n，表示ls所在班里的学生的数量(2 <= N <= 100)第2 - N+1行，第一个数为第i个同学的课程的数量，接下来3个数对应3门课程的成绩（0<=m[i]<=100），接下来为一个字符串s表示第i个同学的名字（字符串的长度<=30且只是字母保证不会出现相同的名字）。
     *
     *
     * Output
     *
     * 输出他们排名后的结果。
     *
     *
     * Sample Input 1
     *
     * 3
     * 100 100 100 ls
     * 99 99 100 kt
     * 99 100 99 ksgggggggggggggg
     * Sample Output 1
     *
     * ls 300
     * ksgggggggggggggg 298
     * kt 298
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Person[] person = new Person[n];
        for (int i = 0; i < n; i++) {
            int x1 = cin.nextInt();
            int x2 = cin.nextInt();
            int x3 = cin.nextInt();
            person[i] = new Person(x1 + x2 + x3, cin.nextLine().trim());
        }
        Arrays.sort(person);
        for (int i = 0; i < n; i++) {
            System.out.println(person[i].name + " " + person[i].score);
        }
    }

    static class Person implements Comparable<Person> {
        int score;
        String name;

        public Person(int score, String name) {
            this.score = score;
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            if (score == o.score) return name.compareTo(o.name);
            return score > o.score ? -1 : 1;
        }
    }
}
