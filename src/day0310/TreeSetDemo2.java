import java.util.*;

class Student implements Comparable//该接口强制让学生具备比较性。
{
	private String name;
	private int age;

	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object obj)
	{

		//return 0;
		
		if(!(obj instanceof Student))
			throw new RuntimeException("不是学生对象");
		Student s = (Student)obj;

		//System.out.println(this.name+"....compareto....."+s.name);
		if(this.age>s.age)
			return 1;
		if(this.age==s.age)
		{
			return this.name.compareTo(s.name);
		}
		return -1;
		/**/
	}

	public String getName()
	{
		return name;

	}
	public int getAge()
	{
		return age;
	}
}
class TreeSetDemo2 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet(new MyCompare());

		ts.add(new Student("lisi02",22));
		ts.add(new Student("lisi02",21));
		ts.add(new Student("lisi007",20));
		ts.add(new Student("lisi09",19));
		ts.add(new Student("lisi06",18));
		ts.add(new Student("lisi06",18));
		ts.add(new Student("lisi007",29));
		//ts.add(new Student("lisi007",20));
		//ts.add(new Student("lisi01",40));

		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			Student stu = (Student)it.next();
			System.out.println(stu.getName()+"..."+stu.getAge());
		}
	}
}

class MyCompare implements Comparator {
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        int num = s1.getName().compareTo(s2.getName());
        if (num==0){
            return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
        }
        return num;
    }
}
