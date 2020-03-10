import java.util.*;

class GenericDemo6 {
    public static void main(String[] args) {
        // ArrayList<String> al = new ArrayList<String>();
        // al.add("abc1");
        // al.add("abc2");
        // al.add("abc3");

        // ArrayList<Integer> al1 = new ArrayList<Integer>();
        // al1.add(4);
        // al1.add(8);
        // al1.add(12);

        // printColl(al);
        // printColl(al1);

        ArrayList<Person> al = new ArrayList<Person>();
        al.add(new Person("abc1"));
        al.add(new Person("abc2"));
        al.add(new Person("abc3"));

        ArrayList<Student> al1 = new ArrayList<Student>();
        al1.add(new Student("abc----1"));
        al1.add(new Student("abc----2"));
        al1.add(new Student("abc----3"));
        printColl(al);
        printColl(al1);

        TreeSet<Student> ts = new TreeSet<Student>();
        ts.add(new Student("abc1"));
        ts.add(new Student("abc2"));
        ts.add(new Student("abc3"));

        printColl(ts);
    }

    public static void printColl(Collection<? extends Person> al) {
        Iterator<? extends Person> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }

    // public static <String> void printColl(ArrayList<String> al){
    //     Iterator<String> it = al.iterator();
    //     while (it.hasNext()) {
    //         System.out.println(it.next());
    //     }
    // }

    // public static  void printColl(ArrayList<String> al) {
    //     Iterator<String> it = al.iterator();
    //     while(it.hasNext()) {
    //         System.out.println(it.next());
    //     }
    // }


}

class Person {
    private String name;
    Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

// class Student extends Person {
//     Student(String name) {
//         super(name);
//     }
// }

class Student implements Comparable<Person> {
    public int compareTo(Person s) {
        this.getName();
    }
}

class Comp implements Comparator <Person> {
    public int compare(Person s1, Person s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

