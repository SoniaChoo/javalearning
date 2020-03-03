abstract class AbsDemo {
    abstract void show();
}

class Outer {
    int x = 3;
    class Inner extends AbsDemo {
        int num = 90;
        void show(){
            System.out.println("show:"+num);
        }
        void abc() {
            System.out.println("hehe");
        }
    }

    public void function(){
        AbsDemo a = new Inner();
        Inner in = new Inner();
        a.show();
        in.show();
        in.abc();
        AbsDemo d = new AbsDemo() {
            int num = 9;
            void show() {
                System.out.println("show:"+num);
            }
            void abc(){
                System.out.println("haha");
            }
        };
        d.show();
    }
}

class InnerClassDemo4 {
    public static void main(String[] args) {
        new Outer().function();
    }
}