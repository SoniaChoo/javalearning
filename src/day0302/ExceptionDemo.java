class Demo {
    int div(int a, int b) throws Exception {
        return a/b;
    }
}

class ExceptionDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            int x = d.div(4,1);
            System.out.println("x="+x);
        }
        catch(Exception e) {
            System.out.println("chu ling la");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("over");
    }
}