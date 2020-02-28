class Single {
    private int num;
    private Single(){}
    private static Single s = new Single();
    public static Single getInstance() {
        return s;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class SingleDemo {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        s1.setNum(23);
        System.out.println(s2.getNum());

    }
}