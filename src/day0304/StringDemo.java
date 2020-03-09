class StringDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s = "abcde";
        method_1(s);
    }

    public static void method_1(String s) {
        char ch = s.charAt(0);
        System.out.println("ch="+ch);
        int num = s.codePointAt(0);
        System.out.println("num="+num);

        String s1 = "qq";
        s1 = s1.concat("mm");

        System.out.println("s1="+s1);
        System.out.println("qq"+"mm");

        String a = "opq";
        String b = "opq";
        System.out.println("a==b:"+(a==b));
    }
}