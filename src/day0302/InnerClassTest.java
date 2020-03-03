interface Inter {
    void method();
}

class Test {
    // static class Inner implements Inter {
    //     public void method() {
    //         System.out.println("method run");
    //     }
    // }
    // static Inter function() {
    //     return new Inter(){
    //         public void method(){
    //             System.out.println("method run");
    //         }
    //     };
    // }

  public static void function() {
        new Inter(){
        public void method(){
            System.out.println("method run");
        }
        }.method(); 
    }
}


class InnerClassTest {
    public static void main(String[] args) {
        Test.function();
        // Inter in = Test.function();
        // in.method();
    }

    public static void show(Inter in) {
            in.method();
        }
}
