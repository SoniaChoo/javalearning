class Fu {
    int num;
    Fu() {
        num = 60;
        System.out.println("fu run");
    }

    Fu (int x) {
        System.out.println("fu ...." + x);
    }
}

class Zi extends Fu {
    Zi () {
       super();
        System.out.println("zi run");
    }

    Zi(int x) {
        this();
        System.out.println("zi..."+x);
    }
}

class ExtendsDemo4 {
    public static void main(String[] args) {
        Zi z = new Zi(0);
        System.out.println(z.num);
    }
}