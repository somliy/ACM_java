在C语言中，通常字符串用char数组记录，便于单个字符的操作，
例如统计字母个数，
java中一般用String记录，取出单个字符用
string.charAt(i) i为下标

s[(int) str.charAt(i) - (int) 'a']++;

---













































-------------------------------------------------------------------------




Queue<Arrow> q = new PriorityQueue<Arrow>(m, new Comparator<Arrow>() {
    @Override
    public int compare(Arrow o1, Arrow o2) {
        return o1.cost - o2.cost;//从小到大
    }
});
------------------------------------------------------------------------
static class Point implements Comparable<Point> {
    int site;
    long value;

    public Point(int site, long value) {
        this.site = site;
        this.value = value;
    }

    @Override
    public int compareTo(Point o) {
        //if (value > o.value)//从小到大
        //    return 1;
        //else return -1;
        this.value>o.value?1:-1;
    }
}
-------------------------------------------------------------------------
memset(a, -1, sizeof(a));
Arrays.fill(visit, -1);
-------------------------------------------------------------------------

PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

poll()是取得头节点，然后从队列中删除。
peek()是取得头节点。
clear()是删除所有节点。
iterator()是返回一个循环iterator
remove（Object o）是从队列中删除对象o
-------------------------------------------------------------------------

