class StringBufferDemo {
    public static void main(String[] args) {
        method_delete();
        method_update();
        method_add();
        StringBuilder sb = new StringBuilder("abcdef");
        char[] chs = new char[6];
        sb.getChars(1, 4, chs, 1);
        for (int x=0; x< chs.length;x++) {
            sop("chs["+x+"]="+chs[x]);
        }
        draw(3, 6);
        draw(8,9);
    }

    public static void method_update() {
        StringBuffer sb = new StringBuffer("abcdefghijklmn");
        sb.replace(1, 10, "java");
        sb.setCharAt(2, 'k');
        sop(sb.toString());
    }

    public static void method_delete() {
        StringBuffer sb = new StringBuffer("abcde");
        sb.delete(1,3);
        sb.deleteCharAt(2);
        sop(sb.toString());
    }

    public static void method_add() {
        StringBuffer sb = new StringBuffer();
        sb.append("abc").append(true).append(34);
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = new StringBuffer();
        sop("sb2==sb3:"+(sb3==sb2));
        sb.insert(1,"qq");
        sop(sb.toString());
    }

    public static void draw(int row, int col) {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < row; x++) {
            for (int y =0 ;y < col; y++) {
                sb.append("*");
            }
            sb.append("\r\n");
        }
        sop(sb.toString());
    }
    public static void sop(String s) {
        System.out.println(s);
    }

}