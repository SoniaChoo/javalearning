class Car {

    Car() {
        System.out.println("this is a Car");
    }

    Car(String c) {
        System.out.println("this is a "+c);
    }
    // String color = "red";
    // int num = 4;
    // void show() {
    //     System.out.println("color="+color+"..num="+num);
    // }
}

class BabyCar extends Car {
    BabyCar() {

        System.out.println("this is a BabyCar");
    }
    BabyCar(String c) {
        
        System.out.println("BabyCar " +c);
    }
}

class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Benz");

        Car c3 = new BabyCar();
        Car c4 = new BabyCar("zz");
        // c.color = "black";
        // c.show();
    }
}