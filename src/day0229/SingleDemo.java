class Single {
    private Single(){};
    private static Single s = new Single();
    public static Single getInstance() {
        return s;
    }
    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return  age;
    }
}

class SingleDemo {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();

        s1.setAge(23);
        System.out.println(s2.getAge());
    }
}

class Student {
    private int age;
    private static Student s = new Student();
    private Student(){};
    public static Student getStudent(){
        return s;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}