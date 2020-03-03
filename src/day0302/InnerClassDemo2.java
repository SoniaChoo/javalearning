class Outer {
    private static int x = 3;
    static class Inner {
        static void function() {
            System.out.println("inner:"+x);
        }
    }

    static class Inner2 {
        void show() {
            System.out.println("inner2 show");
        }
    }

    public static void method(){
        new Inner2().show();
    }
}

class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer.method();
        Outer.Inner.function();
        new Outer.Inner2().show();
       // in.function();
    }
}