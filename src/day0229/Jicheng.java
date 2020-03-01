class Fu {
    private int num = 9;
    public void show1(){}
    public void setNum(int num) {
        this.num = num;
    }
    Fu(){}
}

class Zi extends Fu {
    //int num = 4;
    void show() {
        int num = 7;
        System.out.println(num);
    }
}

class Jicheng {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        z.setNum(10);
    }
}