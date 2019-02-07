
# ACM_java

记录用java从零开始刷题。  
先前用C++，现在决定学习java，用题练好语法，提升思维。  
有了先前的经验，尽量写的更加简短更加优化。  

更详细的思路介绍在文件中

---

## 目录

* [51_node](#51_node)
    * [贪心](#51_node_贪心)
* [HDU](#hdu)
    * [贪心](#HDU_贪心)
* [蓝桥](#蓝桥)
    * [入门训练](#入门训练)
    * [基础练习](#基础练习)
    * [算法训练](#算法训练)
    * [算法提高](#算法提高)
    * [历届试题](#历届试题)
* [校赛](#校赛)
    * [第三次校赛补题](#第三次校赛补题)
    
---


## 51_node

### 51_node_贪心

| 题号 | 题目 | 类型 | 一句话题解 |  难度|
| :---: | :---:  | :---: |:---: |:---: |
| 1182 | [完美字符串](/_51_node/greedy/ex_1182完美字符串.java)     | 水题  | 存入数组排序 |0|
| 1344 | [走格子](/_51_node/greedy/ex_1344走格子.java)     | 水题  | 径直走记录最小值 |0|
| 1212 | [无向图最小生成树](/_51_node/greedy/ex_1212无向图最小生成树.java)     | 模板题  | 最小生成树|1|
| 1432 | [独木舟](/_51_node/greedy/ex_1432独木舟.java)     | 思维 | 最大与最小匹配|0|
| 1133 | [不重叠的线段](/_51_node/greedy/ex_1133不重叠的线段.java)     | 思维 | 最早结束才能更多的放置线段|1|
| 1428 | [活动安排问题](/_51_node/greedy/ex_1428活动安排问题.java)     | 思维 | 找出若干组互不干涉的一组活动，每组参考上题|1|
| 1279 | [扔盘子](/_51_node/greedy/ex_1279扔盘子.java)     | 思维 | 井从大到小重置，再判断|1|
| 1163 | [最高的奖励](/_51_node/greedy/ex_1163最高的奖励.java)     | 优先队列 | 优先队列维护最终工作奖励|1|
| 1177 | [聪明的木匠](/_51_node/greedy/ex_1177聪明的木匠.java)     | 数学 | 推论：按每段大小由大到小切割就可以使体力最少|1|
| 1099 | [任务执行顺序](/_51_node/greedy/ex_1099任务执行顺序.java)     | 思维 | 除去必须要的空间之外，还需要加上运行需要的空间|1|
| 1779 | [砝码称重](/_51_node/greedy/ex_1449砝码称重.java)     | 思维 | 用n进制的思想 |2|
| 1191 | [消灭兔子](/_51_node/greedy/ex_1191消灭兔子.java)     | 优先队列+思维 | 对于每一个兔子用箭去匹配，选择最优的箭 |3|
| 1257 | [背包问题V3](/_51_node/greedy/ex_1257背包问题V3.java)     | 二分 | 二分答案计算实际价值与目标价值的差值，越小越接近答案 |3|
| 1255 | [字典序最小的子序列](/_51_node/greedy/ex_1255字典序最小的子序列.java)     | 水题 | 判断栈顶与输入字母关系 |2|
| 1672 | [区间交](/_51_node/greedy/ex_1672区间交.java)     | 前缀和+优先队列 | 队列size=k时，计算结果，取最大 |2|
| 1065 | [最小正子段和](/_51_node/greedy/ex_1065最小正子段和.java)     | 前缀和 | 前缀和标记排序，相邻做差（判断原来位置） |2|



---






















## HDU

### HDU_贪心
| 题号 | 题目 | 类型 | 一句话题解 | 难度|
| :---: | :---:  | :---: |:---: |:---: |
| 1065    | 最小正字段和     | 类型  | 前缀和|


---

## 蓝桥

### 入门训练
| 题号 | 题目 | 类型 | 一句话题解 |难度|
| :---: | :---:  | :---: |:---: |:---: |
| 入门 | [A+B问题](/LanQiao/EntryTraining/ex_BEGIN_1_A加B问题.java) | 水题 | 无 | 0 |
| 入门 | [序列求和](/LanQiao/EntryTraining/ex_BEGIN_2_序列求和.java) | 水题 | 无 | 0 |
| 入门 | [圆的面积](/LanQiao/EntryTraining/ex_BEGIN_3_圆的面积.java) | 水题 | 无 | 0 |
| 入门 | [Fibonacci数列](/LanQiao/EntryTraining/ex_BEGIN_4_Fibonacci数列.java) | 水题 | 无 | 0 |



### 基础练习
| 题号 | 题目 | 类型 | 一句话题解 |难度|
| :---: | :---:  | :---: |:---: |:---: |
| 基础练习 | [闰年判断](/LanQiao/BasicExercise/basic_闰年判断.java) | 水题 | 无 | 0 |
| 基础练习 | [01字串](/LanQiao/BasicExercise/basic_01字串.java) | 水题 | 无 | 0 |
| 基础练习 | [字母图形](/LanQiao/BasicExercise/basic_字母图形.java) | 水题 | 初始化全部可能，直接输出 | 0 |
| 基础练习 | [数列特征](/LanQiao/BasicExercise/basic_数列特征.java) | 水题 | 无 | 0 |
| 基础练习 | [查找整数](/LanQiao/BasicExercise/basic_查找整数.java) | 水题 | 直接找 | 0 |
| 基础练习 | [特殊数字](/LanQiao/BasicExercise/basic_特殊数字.java) | 水题 | 判断每个数字即可 | 0 |
| 基础练习 | [回文数](/LanQiao/BasicExercise/basic_回文数.java) | 水题 | 直接输出 | 0 |
| 基础练习 | [特殊回文数](/LanQiao/BasicExercise/basic_特殊回文数.java) | 水题 | 直接输出 | 0 |
| 基础练习 | [十进制转十六进制](/LanQiao/BasicExercise/basic_十进制转十六进制.java) | 水题 | 利用库函数 | 0 |
| 基础练习 | [十六进制转十进制](/LanQiao/BasicExercise/basic_十六进制转十进制.java) | 水题 | 利用库函数 | 0 |
| 基础练习 | [十六进制转八进制](/LanQiao/BasicExercise/basic_十六进制转八进制.java) | 水题 | C语言版本 | 2 |
| 基础练习 | [数列排序](/LanQiao/BasicExercise/basic_数列排序.java) | 水题 | 排序 | 0 |
| 基础练习 | [时间转换](/LanQiao/BasicExercise/basic_时间转换.java) | 水题 | 计算输出 | 0 |
| 基础练习 | [字符串对比](/LanQiao/BasicExercise/basic_字符串对比.java) | 水题 | 利用库函数 | 0 |
| 基础练习 | [分解质因数](/LanQiao/BasicExercise/basic_分解质因数.java) | 水题 | 除尽换下一个数除 | 0 |
| 基础练习 | [矩阵乘法](/LanQiao/BasicExercise/basic_矩阵乘法.java) | 模板题 | 矩阵快速幂 | 0 |
| 基础练习 | 矩形面积交 | 水题 | 判断位置后算面积 | 0 |
| 基础练习 | [完美的代价](/LanQiao/BasicExercise/basic_完美的代价.java) | 水题 | 暴力寻找 | 1 |
| 基础练习 | [数的读法](/LanQiao/BasicExercise/basic_数的读法.java) | 水题 | 按照题意拼凑即可 | 1 |
| 基础练习 | [Sine之舞](/LanQiao/BasicExercise/basic_Sine之舞.java) | 递归 | 分开解决 | 0 |
| 基础练习 | [FJ的字符串](/LanQiao/BasicExercise/basic_FJ的字符串.java) | 水题 | 拼接字符串即可 | 0 |
| 基础练习 | [芯片测试](/LanQiao/BasicExercise/basic_芯片测试.java) | 水题 | 大于一半就是好芯片 | 0 |
| 基础练习 | [龟兔赛跑预测](/LanQiao/BasicExercise/basic_龟兔赛跑预测.java) | 水题 | 一秒一秒模拟计算 | 1 |
| 基础练习 | [回型取数](/LanQiao/BasicExercise/basic_回型取数.java) | 水题 | 模拟转圈取数 | 1 |
| 基础练习 | [报时助手](/LanQiao/BasicExercise/basic_报时助手.java) | 水题 | 模拟 | 1 |
| 基础练习 | [2n皇后问题](/LanQiao/BasicExercise/basic_2n皇后问题.java) | 搜索 | 一行一行放置，判断可行后放置 | 2 |
| 基础练习 | [Huffuman树](/LanQiao/BasicExercise/basic_Huffuman树.java) | 优先队列 | 优先队列模拟题意即可 | 1 |
| 基础练习 | [高精度加法](/LanQiao/BasicExercise/basic_高精度加法.java) | 水题 | java大数 | 0 |
| 基础练习 | [阶乘计算](/LanQiao/BasicExercise/basic_阶乘计算.java) | 水题 | java大数 | 0 |









### 算法训练
| 题号 | 题目 | 类型 | 一句话题解 |难度|
| :---: | :---:  | :---: |:---: |:---: |
| 1065    | 最小正字段和     | 类型  | 前缀和|
### 算法提高
| 题号 | 题目 | 类型 | 一句话题解 |难度|
| :---: | :---:  | :---: |:---: |:---: |
| 1065    | 最小正字段和     | 类型  | 前缀和|
### 历届试题
| 题号 | 题目 | 类型 | 一句话题解 |难度|
| :---: | :---:  | :---: |:---: |:---: |
| 1065    | 最小正字段和     | 类型  | 前缀和|


---


## 校赛

### 第三次校赛补题
| 题号 | 题目 | 类型 | 一句话题解 |难度|
| :---: | :---:  | :---: |:---: |:---: |
| 1065    | 最小正字段和     | 类型  | 前缀和|