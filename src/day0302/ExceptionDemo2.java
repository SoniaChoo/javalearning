class Demo {
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = new int[a];
        System.out.println(arr[4]);
        return a/b;
    }
}

class ExceptionDemo2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            int x = d.div(5,1);
            System.out.println("x="+x);
        }
        // catch(Exception e) {
        //     System.out.println("hahaha:"+e.toString());
        // }
        catch(ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("bei ling chu");
        }

        // catch(Exception e) {
        //     System.out.println("hahaha:"+e.toString());
        // }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println("yue jie!!");
        }
        // catch(Exception e) {
        //     System.out.println("hahaha:"+e.toString());
        // }
        System.out.println("over");
    }
}