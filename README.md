1.构造函数的小细节：
当一个类中没有定义构造函数时，那么系统会默认给该类加入一个空参数的构造函数。

当在类中自定义了构造函数后，默认的构造函数就没有了。

2.this语句 :用于构造函数之间进行互相调用。

this语句只能定义在构造函数的第一行。因为初始化要先执行。

3.静态有利有弊
利处：对对象的共享数据进行单独空间的存储，节省空间。没有必要每一个对象中都存储一份。
	可以直接被类名调用。
弊端：生命周期过长。
	  访问出现局限性。(静态虽好，只能访问静态。)

静态方法中不可以定义this，super关键字。
	因为静态优先于对象存在。所以静态方法中不可以出现this。

 4.非常非常重要的一点:java中的约束:
 a:如果java文件中只有一个类,那么类名和文件名需要保持一致
 b:如果java文件中多个类,main函数所在的类名和文件名一致
 c:一个java文件中只能有一个被public修饰的类,如果存在这个类,那么这个类的类名和文件需要一致.所以也就是说,如果public类和main所在的类不是同一个,编译会报错. 
-------------------------------------------------20200228
1.switch中如果没有break,会一直往下执行,直到遇到break或者是default,但是如果把default放在最前面,程序会一直运行,直到遇到break或者程序运行结束

2.break 跳出循环如何跳出外循环,可以给外循环取个别名,然后break语句后面加个别名,例如 break w,continue也可以指定标签

3.java里面只有值传递,https://blog.csdn.net/javazejian/article/details/51192130
---------------------------------------------------------------------------------------------------------------------------------------------------2020/02/27
1.List中的元素是有序的,可重复的,在list下面,主要分为3类,一个是ArrayList,一个是LinkedList,还有一个是Vector,其中ArrayList的特点是底层的数据结构是数组,初始默认长度为10,, 每次不够增加50%,vector是100%,查询速度很快,增加删除很慢,线程不同步,LinkedList底层是链表数据结构,特点是增加删除很快,查询稍慢, Vector底层数据结构也是数组,线程同步,所以增删改查都很慢,另外vector特有的查询方式是枚举,但现在一般只用Iterator, 我们现在一般都是只用ArrayList

2.LinkedList的get和remove方法,会出现nosuchelement方法,但是如果换成peek和poll就会把结果变为null.

3.sop(it.next+"..."+it.next)打印的是两个元素.

4.list用add方法存放对象时,add的默认参数是object,所以,在后面迭代器取出时,我们千万不要忘记类型强制转换,不然会运行出错.

5.list集合判断元素是否相同,用的是equals方法,其他集合和它不一样,这个要记一下.contains和remove方法调用的是equals,所以我们比较的时候可能需要复写equals方法,如果你不复写,那么默认调用的equals方法比较的是地址.

6.hashset添加失败,sop打印以下这个语句就会输出bool值.

7.hashSet 如何保持唯一性,是通过元素的两个方法,hashcode和equals方法
如果元素的Hashcode值相同,才会判断equals是否为true
如果元素的Hashcode值不相同,不会调用equals

这两个方法都是object的,一般来说,我们在创建对象时,如果需要用到equals和hashcode方法,都会在类中进行重写,重写时参数和函数名千万不要写错,equals里面的参数是object,而不是实际的类型,不能用泛型,用到的时候只能强制类型转换,因为用了就不是覆盖了.
后面我们学了泛型和treeset之后,我们在建一个对象时,不仅要重写equals和hashcode方法,还要实现comparable,这样这个集合既可以用treeset,也可以用hashset.

8.对于判断元素是否存在和删除,也就是contains和remove,都是通过hashcode和equals,先判断hashcode,如果存在,再去判断equals.
但是arrayList判断和删除元素只依赖equals.
9.hashset线程是不同步的
-----------------------------------------------------------------------------------------------------------以下是20200224
1.string注意点4点:
a.它是一个类变量,也是一个常量
b.equals 和== 的区别,是因为equals复写了object中的object方法
c.String s1 = "abc" 和 String s2 = new String("abc"), s1指向一个对象, s2指向2个对象,这一点只有字符串才会那么特殊
d.一旦被初始化就不能改变的对象,而至于String s1 = "abc", s1 = "ddd", 这样可以成立,是因为s1指向变了,并不是因为对象"abc"变成了"ddd"

2.方法区中存放的数据:方法, 静态数据还有常量池   
3.stringBuffer特点:
a:长度是可以变化的
b:可以直接操作多个数据类型
c:最终会通过toString方法变成字符串
而stringBuilder与stringBuffer的区别是stringBuilder是线程不同步,stringBuffer是线程同步.stringBuilder是线程不同步,所以stringBuffer线程安全,但是在字符串操作中,一般不需要多线程,所以一般用stringBuilder,不需要读锁,可以提高效率.
4.stringBuffer的subString方法最终返回的是一个string
setCharAt的返回值是void
5.升级3个因素:简化书写,提高效率,提高安全性
6.基本数据类型转成字符串方法
a:基本数据类型+""
b:基本数据类型.toString(基本数据类型值)
7.字符串转成基本数据类型:
xxx a = Xxx.parseXxxv("123")
eg: Int a = Int.parseInt("123")//这个方法是静态的,和这个形成对比的还有一个是非静态的,如下:
Integer i = new Integer("123")
int num = i.intValue();

8.Integer x = new Integer(4) 在1.6 版本后可以被简化被书写为 Integer x = 4, 原因为这个步骤中做了一步自动装箱,同时 x = x + 2这一步也可以这样写是先对右边的x进行了自动拆箱,也就是x.intValue(),然后做完加法后又自动装箱给左边的x.
其他基本数据类型也可以做这个转换,只有一种基本数据类型不可以,那就是char
9.十进制转换成其他进制:
toBinaryString();
toHexString();
toOctalString();
10.其他进制转换成十进制:
Integer.parseInt(字符串,进制数)

11.
Integer m = 128
Integer n = 128
m == n ?//false
Integer a = 127
Integer b = 127
a == b ? true//byte 范围内, 不会 开辟新空间
--------------------------------------------
1.'10'这样的char是不存在的!不存在的!不存在的!
---------------------------------------------以下是0214
1.java for 循环中有一种增强,用于循环数组
----------------------------------------------以下是20200213
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

12. switch 语句. 在 Java 7之前，实现基于字符串的条件流的唯一方法是使用 if-else 条件。 但是 Java 7也改进了 switch case 来支持 String。Switch中使用String需要注意一下几点:
* Java中switch是通过String.equals 方法来比较传递值和case值，所以请确保添加 NULL 检查以避免 NullPointerException
* Java switch case String只能在Java7或更高的版本中使用，否则它会抛出异常
(原文链接：https://blog.csdn.net/u011479200/article/details/83177459)
