一, PackageDemo.java:8: 找不到符号
符号： 类 DemoA
位置： 类 pack.PackageDemo
                DemoA d = new DemoA();
                ^
PackageDemo.java:8: 找不到符号
符号： 类 DemoA
位置： 类 pack.PackageDemo
                DemoA d = new DemoA();
                              ^
2 错误

错误原因：类名写错。

因为类名的全名是：包名.类名




PackageDemo.java:8: 软件包 packa 不存在
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: 软件包 packa 不存在
                packa.DemoA d = new packa.DemoA();
                                         ^
2 错误


错误原因：packa包不在当前目录下
需要设置classpath，告诉jvm去哪里找指定的packa包。



PackageDemo.java:8: packa.DemoA 在 packa 中不是公共的；无法从外部软件包中对其进
行访问
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: packa.DemoA 在 packa 中不是公共的；无法从外部软件包中对其进
行访问
                packa.DemoA d = new packa.DemoA();
                                         ^
2 错误

错误原因：有了包，范围变大，一个包中的类要被访问，必须要有足够大的权限。
所以被访问的类要被public修饰。



PackageDemo.java:9: show() 在 packa.DemoA 中不是公共的；无法从外部软件包中对其进
行访问
                d.show();
                 ^
1 错误

错误原因：类公有后，被访问的成员也要公有才可以被访问。





总结：
	包与包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰。

	不同包中的子类还可以直接访问父类中被protected权限修饰的成员。

包与包之间可以使用的权限只有两种，public  protected。


             public   protected       default     private
同一个类中     ok         ok             ok          ok
同一个包中     ok         ok             ok
子类           ok         ok             
不同包中       ok

二, .java.lang : java的核心包 jdk1.2版本以后，该包中的类自动导入。
java.awt: 用于制作图形界面。
java.io:input output  用于操作设备上的数据。
java.util : 这里定义是java的工具类。集合，日期。
java.net:用于网络通讯的。
java.applet:  application  let        server  let    servlet      java server page   jsp  

class haha implements Servlet

class hehe extends HttpServlet

三, 在多态中，成员变量的特点： 无论编译和运行，都参考左边（引用型变量所属的类）
            在多态中，静态成员函数的特点：无论编译和运行，都参考做左边。
            在多态中，非静态成员函数的特点：编译看左边，运行看右边。经典案例看DuoTaiDemo.java and SuperDemo.java

四,匿名函数两种方式:
参考InnerClassTest.java和InnerClassDemo4.java
五,异常的总结

异常：
是什么？是对问题的描述。将问题进行对象的封装。
------------
异常体系：
	Throwable
		|--Error
		|--Exception
			|--RuntimeException

异常体系的特点：异常体系中的所有类以及建立的对象都具备可抛性。
				也就是说可以被throw和throws关键字所操作。
				只有异常体系具备这个特点。


--------------
throw和throws的用法：

throw定义在函数内，用于抛出异常对象。
throws定义在函数上，用于抛出异常类，可以抛出多个用逗号隔开。


当函数内容有throw抛出异常对象，并未进行try处理。必须要在函数上声明，都在编译失败。
注意，RuntimeException除外。也就说，函数内如果抛出的RuntimeExcpetion异常，函数上可以不用声明。
--------------


如果函数声明了异常，调用者需要进行处理。处理方法可以throws可以try。

异常有两种：
	编译时被检测异常
		该异常在编译时，如果没有处理(没有抛也没有try)，编译失败。
		该异常被标识，代表这可以被处理。
	运行时异常(编译时不检测)
		在编译时，不需要处理，编译器不检查。
		该异常的发生，建议不处理，让程序停止。需要对代码进行修正。



--------------
异常处理语句：
try
{
	需要被检测的代码；
}
catch ()
{
	处理异常的代码；
}
finally
{
	一定会执行的代码；
}

有三个结合格式：
1.	try
	{
		
	}
	catch ()
	{
	}

2.	try
	{
		
	}
	finally
	{
	
	}


3.	try
	{
		
	}
	catch ()
	{
	}
	finally
	{
	
	}



注意：
1，finally中定义的通常是 关闭资源代码。因为资源必须释放。
2，finally只有一种情况不会执行。当执行到System.exit(0);fianlly不会执行。

--------------

自定义异常：
	定义类继承Exception或者RuntimeException
	1,为了让该自定义类具备可抛性。
	2，让该类具备操作异常的共性方法。

	当要定义自定义异常的信息时，可以使用父类已经定义好的功能。
	异常异常信息传递给父类的构造函数。
	class MyException extends Exception
	{
		MyException(String message)
		{
			super(message);
		}
	}

自定义异常：按照java的面向对象思想，将程序中出现的特有问题进行封装。
--------------


异常的好处：
	1，将问题进行封装。
	2，将正常流程代码和问题处理代码相分离，方便于阅读。


异常的处理原则：
	1，处理方式有两种：try 或者 throws。
	2，调用到抛出异常的功能时，抛出几个，就处理几个。
		一个try对应多个catch。
	3，多个catch，父类的catch放到最下面。
	4，catch内，需要定义针对性的处理方式。不要简单的定义printStackTrace，输出语句。
		也不要不写。
		当捕获到的异常，本功能处理不了时，可以继续在catch中抛出。
		try
		{
			throw new AException();
		}
		catch (AException e)
		{
			throw e;
		}

		如果该异常处理不了，但并不属于该功能出现的异常。
		可以将异常转换后，在抛出和该功能相关的异常。

		或者异常可以处理，当需要将异常产生的和本功能相关的问题提供出去，
		当调用者知道。并处理。也可以将捕获异常处理后，转换新的异常。
		try
		{
			throw new AException();
		}
		catch (AException e)
		{
			// 对AException处理。
			throw new BException();
		}

		比如，汇款的例子。

	
异常的注意事项：
	在子父类覆盖时：
	1，子类抛出的异常必须是父类的异常的子类或者子集。
	2，如果父类或者接口没有异常抛出时，子类覆盖出现异常，只能try不能抛。



参阅
ExceptionTest.java 老师用电脑上课
ExceptionTest1.java 图形面积。

六,，调用线程的start方法，
	该方法两个作用：启动线程，调用run方法, 如果没有start的话,就是单线程了.
--------------------------------------------------------2020/03/03
1.
E, double f4[]={1,3,5}; //yes  double d = 1; s.o.p(d);//1.0;
F, int f5[]=new int[3]{2,3,4};  //错，右边中括号不能写具体数值，因为数据的元素和个数都在大括号体现了。

2.内部类的访问规则：
a，内部类可以直接访问外部类中的成员，包括私有。
	之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，格式 外部类名.this
b，外部类要访问内部类，必须建立内部类对象。

访问格式：
a,当内部类定义在外部类的成员位置上，而且非私有，可以在外部其他类中。
可以直接建立内部类对象。
格式
	外部类名.内部类名  变量名 = 外部类对象.内部类对象;
	Outer.Inner in = new Outer().new Inner();

b,当内部类在成员位置上，就可以被成员修饰符所修饰。
	比如，private：将内部类在外部类中进行封装。
		static:内部类就具备static的特性。
		当内部类被static修饰后，只能直接访问外部类中的static成员。出现了访问局限。

		在外部其他类中，如何直接访问static内部类的非静态成员呢？
		new Outer.Inner().function();

		在外部其他类中，如何直接访问static内部类的静态成员呢？
		Outer.Inner.function();
		//特别注意,这里不需要new!!!

	注意：当内部类中定义了静态成员，该内部类必须是static的。
		  当外部类中的静态方法访问内部类时，内部类也必须是static的。



	
当描述事物时，事物的内部还有事物，该事物用内部类来描述。
因为内部事务在使用外部事物的内容。

3.内部类定义在局部时，
a:不可以被成员修饰符修饰
b:可以直接访问外部类中的成员，因为还持有外部类中的引用。
	但是不可以访问它所在的局部中的变量。只能访问被final修饰的局部变量。但是经过在InnerClassDemo3中测试,好像final现在已经不需要自己加了

4.
匿名内部类:
a，匿名内部类其实就是内部类的简写格式。
b，定义匿名内部类的前提：
	内部类必须是继承一个类或者实现接口。
c，匿名内部类的格式：  new 父类或者接口(){定义子类的内容}
d，其实匿名内部类就是一个匿名子类对象。而且这个对象有点胖。	可以理解为带内容的对象。
e，匿名内部类中定义的方法最好不要超过3个。

5.对多异常的处理。

a，声明异常时，建议声明更为具体的异常。这样处理的可以更具体。
b，对方声明几个异常，就对应有几个catch块。不要定义多余的catch块。
	如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面。
------------------------------------------------20200302
1.继承：
	特点：
		1，提高了代码的复用性。
		2，让类与类之间产生关系，是多态性的前提。

	Java中的继承。
		1，java只支持单继承，不支持多继承。为啥呢？答案：因为继承了多个父类如果有相同方法时，
												子类对象不确定运行哪一个。
		2，Java还支持多层继承。A-->B--->C  原来可以形成继承体系。
			想要使用体系功能，"查阅父类功能，建立子类对象调用功能。"
			注解：父类的由来其实是由事物中的共性内容不断向上抽取而来的。
				所以父类中定义的是该体系中的最基本，最共性功能。
	
	继承出现后，代码上也有一些特点：
	1，变量。
		当子父类中定义了相同的名称的成员变量，
		子类要使用父类中的同名变量时，需要使用关键字super来区分。
		一般不会出现这种情况，因为父类中有了，子类不需要定义。
		而且父类定义时，一般变量都私有化。

	2，函数。
		子类可以直接访问父类中非私有的成员函数。
		特殊情况：当子类中定义了与父类一模一样的方法时，会发生覆盖操作。大多指的是非静态方法。
				  最终会运行子类的方法，父类相当于被覆盖了。
				  函数的另一个特性：覆盖（重写，复写）。
				  什么时候用啊？
				  当父类的功能要被修改时，不建议修改源码。因为是灾难。
				  只要通过一个类继承原有类，定义一个新的升级后的功能即可。
				  但是功能是相同的，只是实现方法改变。这是子类可以沿袭父类中的功能定义，
				  并重写功能内容。这就是覆盖。

				  覆盖很爽，但是有注意事项：
				  1，子类覆盖父类时，必须权限要大于等于父类权限。
				  2，静态不能覆盖非静态。
			
	3，构造函数。
		构造函数可以本类进行对象初始化，也可以给子类对象进行初始化。
		子类对象初始化过程：
		子类中的所有构造方法都会访问父类中空参数的构造函数，
		因为每一个构造函数的第一行，都有一句隐式的super语句。
		为什么要有这条语句？
		因为子类会获取到父类中的数据，必须要先明确父类对数据的初始化过程。

		当父类中没有空参数构造函数时，子类构造函数必须通过super句来明确要访问的父类中指定的构造函数。

		当时子类构造函数也可以通过this语句访问本类中的构造函数。
		但是子类中肯定，至少有一个构造函数会访问父类。

	
抽象类：其实就是在分析事物时，事物中的功能有些是不明确的内容的。这些不明确内容就是抽象的。
		可以通过抽象函数来描述。

		抽象函数一定要定义在抽象类中，因为，抽象函数所在类，也必须被抽象标识。

		写法特点：
		1，抽象函数只对函数进行声明，没有函数主体。
		2，抽象类和抽象函数都需要用abstract修饰。
		3，抽象类不可以进行实例化。
		4，想要使用抽象功能，必须通过子类覆盖了父类中所有的抽象方法后，才可以对子类实例化。
			如果只覆盖了部分抽象方法，那么子类还是一个抽象类。

		也可以理解为：抽象类是一个父类，是不断向上抽取而来的，
		在抽取过程中，只抽取了方法声明，但没有抽取方法实现。

		抽象类和一半类差不多。
		区别：
		抽象类可以定义抽象方法。
		抽象类不可以建立对象。

		其实抽象类一样用于描述事物，既可以定义抽象方法，也可以定义非抽象方法。


	

接口
	 初期理解：接口看上去是一个特殊的抽象类。里面存的都是抽象方法。

	 特点：
	 格式：
		1，通过interface来定义。
		2，接口中常见成员：常量，抽象方法。
			而且这些成员都有固定的修饰符。
			常量：public static final
			方法：public abstract 
		3，接口中的成员都是共有的。
		4，一个类可以对接口进行多实现，也弥补了多继承带来的安全隐患，所以java对多继承进行了改良。
			用多实现方法来体现多继承的特性。
		5，一个类可以继承一个类的同时，实现多个接口。
		6，接口与接口之间是继承关系，而且可以多继承。


	应用特点：
		1，接口是对外暴露的规则。
		2，接口是功能的扩展。
		3，接口的出现降低了耦合性。
		别忘了说的时候，需要举例。如usb。pci，主板。插座。


抽象类和接口异同：
相同：
1，都可以在内部定义抽象方法。
2，通常都在顶层。
3，都不可以实例化，都需要子类来实现。

不同点：
1，抽象类中可以定义抽象方法和非抽象方法，
	而接口中只能定义抽象方法。
2，接口的出现可以多实现。
	抽象类只能单继承。
	也就是说：接口的出现避免了单继承的局限性。
3，继承和实现的关系不一致。继承：is a，实现：like a 

2.
-----------------------------------------------------------------20200301
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
