import java.util.*;

class Person{
    private String name;
    private int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age == p.age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

class ArrayListTest2 {
    public static void sop(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        //al.add(new Demo());
        al.add(new Person("lisi01", 30));
        al.add(new Person("lisi02", 32));
        al.add(new Person("lisi04", 35));
        al.add(new Person("lisi03", 33));
        al.add(new Person("lisi04", 35));

        al = singleElement(al);
        sop("remove 03:"+al.remove(new Person("lisi03", 33)));
        Iterator it = al.iterator();
        while (it.hasNext()) {
            Person p = (Person)it.next();
            sop(p.getName()+"::"+p.getAge());
        }
    }

    public static ArrayList singleElement(ArrayList al) {
        ArrayList newAl = new ArrayList();
        Iterator it = al.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            if (!newAl.contains(obj)) {
                newAl.add(obj);
            }
        }
        return newAl;
    }
}
