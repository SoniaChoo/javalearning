interface Inter {
    public static final int NUM = 1;
    public abstract void show();
}

interface InterA {
    public abstract void show();
}

class Demo {
    public void function(){}
}

class Test extends Demo implements Inter,InterA {
    public void show() {}
}

interface A {
    void methodA();
}
interface B {
    void methodB();
}

interface C extends B,A {
    void methodC();
}

class D implements C {
    public void methodA(){}
    public void methodB(){}
    public void methodC(){}
}

class InterfaceDemo {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.NUM);
        System.out.println(Test.NUM);
        System.out.println(Inter.NUM);
    }
}