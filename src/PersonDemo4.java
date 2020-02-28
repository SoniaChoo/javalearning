class Person {
    private String name;
    private int age;
    {
        System.out.println("code run");
    }

    Person() {
        this("hah");
        System.out.println("person run");
    }

    Person (String name) {
        //this();
        this.name = name;
    }

    Person (String name, int age) {
        this.age = age;
        this.name = name;
    }
}

class PersonDemo4 {
    public static void main(String[] args) {
        new Person();
        //Person p = new Person("lisi", 30);
        //Person p1 = new Person("lisi2");
    }
}