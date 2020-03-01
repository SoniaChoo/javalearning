class StaticCode {
    int  num = 9;
    StaticCode() {
        System.out.println("b");
    }
    static {
        System.out.println("a");
    }
    {
        System.out.println("c"+this.num);
    }

    StaticCode(int x) {
        System.out.println("d");
    }
    public static void show(){
        System.out.println("show run");
    }
}

class StaticCodeDemo {
    static {
        System.out.println("b");
    }
    public static void main(String[] args) {
        //new StaticCode(4);
        // new StaticCode();
        // System.out.println("over");
        // StaticCode.show();
        StaticCode s = null;
        s = new StaticCode();
    }
    static {
        System.out.println("c");
    }
}