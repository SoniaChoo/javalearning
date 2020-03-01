class  Person {
    private String name;
    private int age;
    Person(int age) {
        this.age = age;
    }
    Person(String name) {
        this.name = name;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("name=" + this.name+"...age="+this.age);
        this.show();
    }

    public void show(){
        System.out.println(this.name);
    }
    
    public boolean compare(Person p) {
        return this.age == p.age;
    }
}

class PersonDemo3 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        Person p2 = new Person(20);
        boolean b = p1.compare(p2);
        System.out.println(b);
    }
}