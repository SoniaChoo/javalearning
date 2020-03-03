class Outer {
    private static int x = 3;
    class Inner {
        int x = 4;
        void function() {
            int x = 6;
            System.out.println("inner:"+Outer.x);
            System.out.println(Outer.Inner.this.x);
            System.out.println(x);
        }
    }
    void method(){
        Inner in = new Inner();
        in.function();
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.method();

        Outer.Inner in = new Outer().new Inner();
        in.function();
    }
}