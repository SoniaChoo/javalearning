import java.util.*;

class GenericDemo7 {
    public static void main(String[] args){
        TreeSet<Student> ts = new TreeSet<Student>(new Comp());
        ts.add(new Student("abc01"));
        ts.add(new Student("abc02"));
        ts.add(new Student("abc03"));

        Iterator<Student> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }

        TreeSet<Person> ts2 = new TreeSet<Person>(new Comp());
        ts2.add(new Person("person--abc01"));
        ts2.add(new Person("person---abc02"));
        ts2.add(new Person("person---abc03"));

        Iterator<Person> it2 = ts2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next().getName());
        }


        TreeSet<Worker> ts1 = new TreeSet<Worker>(new Comp());
        ts1.add(new Worker("worker----abc01"));
        ts1.add(new Worker("worker----abc02"));
        ts1.add(new Worker("worker----abc03"));

        Iterator<Worker> it1 = ts1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next().getName());
        }
    }
}

class StuComp implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class WorkerComp implements Comparator<Worker> {
    public int compare(Worker w1, Worker w2){
        return w1.getName().compareTo(w2.getName());
    }
}

class Comp implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        return p1.getName().compareTo(p2.getName());
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

class Worker extends Person {
    Worker(String name){
        super(name);
    }
}