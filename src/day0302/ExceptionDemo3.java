class FuShuException extends Exception {
    private int value;
    // FuShuException() {
    //     super();
    // }
    FuShuException(String msg, int value) {
        super(msg);
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

class Demo {
    int div(int a, int b) throws FuShuException {
        if (b<0) {
            throw new FuShuException("/ by fu shu", b);
        }
        return a/b;
    }
}

class ExceptionDemo3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            int x = d.div(4, -9);
            System.out.println("x="+x);
        }
        catch(FuShuException e) {
            System.out.println("fu shu shi:"+ e.getValue());
        }

        System.out.println("over");
    }
}