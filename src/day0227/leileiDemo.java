class leileiDemo
{
	public static void main(String[] args)
	{
		Person d = new Person();
        Person p = new Person();
		d.x = 10;
        p.x = 99;
		show(d,p);//show(new Demo());
		System.out.println(d.x);
        System.out.println(p.x);
	}
	public static void show(Person d, Person p)
	{
		d= p;
        p= new Person();
	}
}

class Person {
    int x = 3;
}