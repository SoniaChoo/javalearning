abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("eat fish");
    }
    public void catchMouse(){
        System.out.println("catch mouse");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("eat bone");
    }
    public void kanjia(){
        System.out.println("kanjia");
    }
}

class Pig extends Animal {
    public void eat() {
        System.out.println("siliao");
    }
    public void gongDi() {
        System.out.println("gongdi");
    }
}

class DuoTaiDemo2 {
    public static void main(String[] args) {
        function(new Dog());
        function(new Cat());
    }

public static void function(Animal a) {
    a.eat();
    if (a instanceof Cat) {
        Cat c = (Cat)a;
        c.catchMouse();
    }else if (a instanceof Dog) {
        Dog d = (Dog)a;
        d.kanjia();
    }
}
}