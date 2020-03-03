class Super
{
	int i=0;
	public Super(String a)
	{
		System.out.println("A");
		i+=1;	
	}
	public Super()
	{
		System.out.println("B");
		i+=2;
	}
}
class SuperDemo extends Super
{
	//int i=4;  特别注意,如果这里没有声明一个新的int,那么多态时输出的i = 7,inside的结果是4
	//如果这里声明了int i = 4, 输出的多态的结果是2, inside的结果是9
	public SuperDemo(String a)
	{
		//super();
		super.i+=5;
		System.out.println("inside zi, "+i);
		System.out.println("C");				
	}
	public static void main(String[] args)
	{
		Super zi=new SuperDemo("main");
		System.out.println(zi.i);

		Super d=new Super("main");
		System.out.println(d.i);
		// SuperDemo sd=new SuperDemo("A");
		// System.out.println(sd.i);dui
	}
}