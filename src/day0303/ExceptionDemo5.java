class FuShuException extends Exception {
    FuShuException(String msg) {
        super(msg);
    }
}

class Demo {
    int div(int a, int b) throws FuShuException {
        if (b < 0) {
            throw new FuShuException("fu shu");
        }
        return a/b;
    }
}

class ExceptionDemo5 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            int x = d.div(4, 1);
            System.out.println("x="+x);
        }
        catch (FuShuException e) {
            System.out.println(e.toString());
            return;
            //System.exit(0);
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("over");
    }
}

