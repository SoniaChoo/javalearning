
class Fu {
    int num = 5;
    void method1() {
        System.out.println("fu method_1");
    }
    void method2(){
        System.out.println("fu method_2");
    }
    static void method4() {
        System.out.println("fu method_4");
    }
}

class Zi extends Fu {
    int num = 8;
    void method1(){
        System.out.println("zi mwthod_1");
    }
    void meyhod3(){
        System.out.println("zi method_3");
    }

    static void method4(){
        System.out.println("zi method_4");
    }
}

class DuoTaiDemo4 {
    public static void main(String[] args){
        Fu f = new Zi();
        System.out.println(f.num);
        Zi z = new Zi();
        System.out.println(z.num);
        // f.method1();
        // f.method2();
        // //f.method3();
        // f.method4();
        // z.method4();
    }
}