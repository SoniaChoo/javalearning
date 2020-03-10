import java.util.*;

class TreeSetDemo{
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        ts.add(new Student("lisi02",22));
        ts.add(new Student("lisi007",20));
        ts.add(new Student("lisi09", 19));
        ts.add(new Student("lisi08",19));

        Iterator it = ts.iterator();
        while(it.hasNext()){
            Student stu = (Student)it.next();
            System.out.println(stu.getName()+"..."+stu.getAge());
        }
    }
}

class Student implements Comparable {
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof Student)) {
            throw new RuntimeException("not student");
        }
        Student s = (Student)obj;

        System.out.println(this.name+"...compareto...."+s.name);
        if (this.age > s.age){
            return 1;
        }
        if (this.age == s.age){
            return this.name.compareTo(s.name);
        }
        return -1;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
