class Fu {

    private int num = 4;
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return this.num;
    }
}

class Zi extends Fu {
    //int num = 5;
    void show() {
        System.out.println(num);
    }
}

class ExtendsDemo2 {
    public static void main(String[] args)  {
        Zi z = new Zi();
        z.show();
    }
}