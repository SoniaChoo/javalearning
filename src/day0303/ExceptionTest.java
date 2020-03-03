class NoValueException extends RuntimeException {
    NoValueException(String message) {
        super(message);
    }
}

interface Shape {
    void getArea();
}

class Rec implements Shape {
    private int len,wid;
    Rec(int len, int wid) {
        if (len <= 0 || wid <= 0) {
            throw new NoValueException("fei fa zhi");
        }
        this.len = len;
        this.wid = wid;
    }

    public void getArea() {
        System.out.println(len*wid);
    }
}

class Circle implements Shape {
    private int radius;
    public static final double PI = 3.14;
    Circle(int radius) {
        if (radius <= 0 ) {
            throw new NoValueException("fei fa");
        }
        this.radius = radius;
    }

    public void getArea(){
        System.out.println(PI*radius*radius);
    }
}

class EXCeptionTest {
    public static void main(String[] args) {
        Rec r = new Rec(3, 4);
        r.getArea();
        Circle c = new Circle(-8);
        c.getArea();

        System.out.println("over");
    }
}