class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(40);
    }
}

class Person {
    private int age;
    public void setAge(int a) {
        if (a > 0 && a < 130) {
            age = a;
            speak();
        }
        else {
            System.out.println("feifa age");
        }
    }

    public int getAge() {
        return age;
    }

    private void speak() {
        System.out.println("age="+age);
    }
}