/*
class C {
    void demo1(){}
}

class A extends C {
    void demo2(){}
}

class B extends C {
    void demo3(){}
}

class A {
    void show() {
        System.out.println("a");
    }
}

class B {
    void show {
        System.out.println("b");
    }
}

class C extends A, B {}

C c = new C();
c.show();
*/

class Person {
    String name;
    int age;
}

class Student extends Person {
    void study() {
        System.out.println("good study"+name);
    }
}

class Worker extends Person {
    void work(){
        System.out.println("good work");
    }
}

class ExtendsDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "zhangsan";
        s.study();
    }
}

