import java.util.*;

class GenericTest {
    public static void main(String[] args){
        ArrayList<Person>  al = new ArrayList<Person>();
        al.add(new Person("ahah"));

        ArrayList<Student> al1 = new ArrayList<Student>();
        al1.add(new Student("haha"));
        al.addAll(al1);

        Iterator<Person> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
}

class Person {
    private String name;
    Person(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "person:"+name;
    }
}

class Student extends Person {
    Student(String name){
        super(name);
    }
}