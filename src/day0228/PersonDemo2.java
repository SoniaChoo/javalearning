class Perosn{
    private String name;
    private int age;
    //以下是构造代码块:
    /*{
        System.out.println("person code run");
        cry();
    }

    Person() {
        System.out.println("A:name="+name+",,age="+age);
    }
     */

     Person(String n) {
         name = n;
         System.out.println("B:name="+name+",,age="+age);
     }

     public void setName(String n) {
         name = n;
     }
     public String getName() {
         return name;
     }

     Person(String n, int a) {
         name = n;
         age = age;
         System.out.println("C:name="+name+",,age="+age);
     }

     public void cry(){
         System.out.println("cry.....");
     }

     class PersonDemo2 {
         public static void mai(String[] args) {
             Person p1 = new Person();

             Person p2 = new Person("lisi");

             
         }
     }
}