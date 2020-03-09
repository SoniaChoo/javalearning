class IntegerDemo {
    public static void sop(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        sop("int max:"+Integer.MAX_VALUE);
        int num = Integer.parseInt("123");
        sop("num:"+num);
        sop(Integer.toBinaryString(-6));
        sop(Integer.toHexString(60));
        int x = Integer.parseInt("3c", 16);
    }
}