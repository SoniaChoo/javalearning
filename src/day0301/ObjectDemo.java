class Demo {
    private int num;
    Demo(int num) {
        this.num = num;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Demo)) {
            return false;
        }
        Demo d = (Demo)obj;
        return this.num == d.num;

    }

    public boolean compare(Demo d) {
        return this.num == d.num;
    }

    public String toString() {
        return "demo:"+num;
    }
}

class Person{}

class ObjectDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo(4);
        System.out.println(d1);
        Demo d2 = new Demo(4);
        System.out.println(d2.toString());
        System.out.println(d1.equals(d2));
        System.out.println(d1.compare(d2));
    }
}

