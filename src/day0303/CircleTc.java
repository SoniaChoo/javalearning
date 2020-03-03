class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public static double compare(Circle[] cir) {
        int max = 0;
        for (int x = 1; x < cir.length;x++) {
            if (cir[x].radius > cir[max].radius) {
                max = x;
            }
        }
        return cir[max].radius;
    }
}

class CircleTc {
    public static void main(String[] args) {
        Circle[] cir = new Circle[3];
        cir[0] = new Circle(1.0);
        cir[1] = new Circle(2.0);
        cir[2] = new Circle(3.0);
        System.out.println(Circle.compare(cir));
    }
}