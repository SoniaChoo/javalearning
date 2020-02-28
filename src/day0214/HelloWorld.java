public class HelloWorld {
    public static void main(String[] args){
        //Person p = new Person();
        //p.setName("zz");
        System.out.println(Person.callPrivate());
    }
}

class Person {
    //private Person(){}
    private static String name = "zz";
    protected static String getName() {
        return name;
    }
    public static String callPrivate() {
        return getName();
    } 
}