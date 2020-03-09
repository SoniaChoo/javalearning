class test_parent {
    int x = 5;
    int y = 10;
    void set_value(int a, int b) {
        x = a;
        y = b;
    }
    int get_1(){
        return this.x+this.y;
    }
    int get_2(){
        return x-y;
    }
}

class test_4 extends test_parent {
    int y;
    test_4(int y){
        this.y = y;
    }
    void set_value(int a, int y) {
        x = a;
        this.y = a+y;
    }
    int get_2(){
        return y;
    }
}

class Test2 {
    public static void main(String[] args) {
        test_4 a1 = new test_4(-1);
        a1.set_value(5, 5);
        int y =  a1.get_2();
        System.out.println("y="+y);

        // int a = 0;
        // int b = 1;
        // System.out.println(a+", "+ b);
        // zz(a, b);    
        // System.out.println(a+", "+ b);

    }

    public static void zz(int a, int b) {
        b = b&a;
        a = b&a;
    }
}