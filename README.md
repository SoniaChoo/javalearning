1.short a = 4
a = a + 4
a += 4
//这两句话的含义有什么不同

2.char 是2个字节

3.b = a++
b = ++a 的区别

4.>>
>>> 补最高位都为0, 在变换进制的时候需要用到,第26个视频19分

5.7^4^4=7, 一个数异或同一个数, 结果还是那个数

6.不借助第三方对两个数据进行交换
方法一:
n = n+m//如果n和m的值都非常大,会导致溢出
m = n-m
n = n-m
方法二:
n = n-m
m = n+m
n= m-n
方法三:
n = n^m
m = n^m
n = n^m

7.三元运算符是if else的简写格式, 但是它有一个缺点,就是必须有返回值.(像打印的语句在三元运算符中出现是不行的,因为没有返回值)

8.while和do while分号的问题注意,在java中,分号和大括号都是这句代码执行结束.

9.for语句第一个分号之前其实只需要是一个合法表达式就行,不需要和第二个分号前的判断条件有联系.当表达式很多的时候,用,分隔开就可以.

10.可以给for循环取别名,跳出的时候也可以在break后面指定跳出哪个循环, continue也有这个功能, break和continue后面记得加上;

11.函数的重载只和参数列表有关系.
