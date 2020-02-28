class Person {
    String name;
    static String country = "CN";
    public static void show() {
        System.out.println(country);
        //this.haha();
    }
    public void haha() {}
}

class StaticDemo {
    public static void main(String[] args) {
        Person p = new Person();
        //p.name = "zhuzhu";
        Person.show();
    }
}