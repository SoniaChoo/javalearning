class Outer {
    int x = 3;
    void method(int a) {
         int y = 4;
        class Inner {
            void function() {
                System.out.println(y);
                System.out.println(x);
            }
        }
        new Inner().function();
    }
}

class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.method(7);
        out.method(8);
    }
}