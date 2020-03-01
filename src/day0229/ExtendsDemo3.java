class Fu {
    void show() {
        System.out.println("fu show");
    }
    void Speak() {
        System.out.println("vb");
    }
}

class Zi extends Fu {
    void speak() {
        System.out.println("java");
    }

    void show() {
        super.show();
        System.out.println("zi show");
    }
}

class ExtendsDemo3 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Tel {
    void show() {
        System.out.println("number");
    }
}

class NewTel extends Tel {
    void show() {
        super.show();
        System.out.println("name");
        System.out.println("pic");
    }
}