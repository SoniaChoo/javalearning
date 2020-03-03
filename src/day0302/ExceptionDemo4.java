class FuShuException extends RuntimeException {
    FuShuException(String msg) {
        super(msg);
    }
}

class Demo {
    int div(int a, int b) {
        if (b<0) {
            throw new FuShuException("fu shu");
        }
        if (b == 0) {
            throw new ArithmeticException("chu xian ling");
        }
        return a/b;
    }
}

class ExceptionDemo4 {
    public static void main(String[] args) {
        Demo d = new Demo();
        int x = d.div(4, -9);
        System.out.println("x="+x);

        System.out.println("over");
    }
}