class IntegerDemo1 {
    public static void main(String[] args) {
        //Integer x = new Integer(4);
        Integer x = 4;
        //x.intValue()
        x = x+2;
        Integer m = 128;
        Integer n = 128;
        sop("m==n:"+(m==n));
        Integer i = 127;
        Integer j = 127;
        sop("a==b:"+(i==j));
        method();
    }

    public static void method(){
        Integer a = new Integer("123");
        Integer b = new Integer(123);
        sop("a==b:"+(a==b));
        sop("a.equals(b):"+a.equals(b));
    }
    public static  void sop(String str) {
        System.out.println(str);
    }
}