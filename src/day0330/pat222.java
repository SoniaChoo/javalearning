import java.util.*;

class pat222 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int d = scan.nextInt();
        int c = a+b;
        if (c == 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[32];
        int pos = arr.length;
        while(c != 0){
            int temp = c % d;
            arr[--pos] = temp;
            c = c/d;
        }
        for (int i = pos; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}