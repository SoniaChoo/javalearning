public class selectsort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 7, 1};
        select(arr);
        printhelp(arr);
    }


public static void select(int[] args) {
    for (int x = 0; x < args.length; x++) {//这里x的上届也可以写为x < args.length-1
            for (int y = x+1; y < args.length; y++) {
                if (args[x] < args[y]) {//正序或者逆序只需要对if条件语句的方向进行修改
                    int temp = args[x];
                    args[x] = args[y];
                    args[y] = temp;
                }
            }
        }
}

public static void printhelp(int[] args) {
    System.out.print("[");
    for (int i = 0; i < args.length; i++) {
            if (i != args.length-1) {
                System.out.print(args[i] + " ");
            }
            else{
                System.out.print(args[i]+"]");
            }
    
       }
}
}