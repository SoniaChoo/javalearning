import java.util.*;

class pat09 {
        public static void main(String[] main){
        Scanner scan = new Scanner(System.in);
        String[] buf = scan.nextLine().split(" ");
        for (int i = 0, j = buf.length-1; i < j; i++,j--) {
            String temp = buf[i];
            buf[i] = buf[j];
            buf[j] = temp;
        }
        for (int i = 0; i < buf.length-1; i++ ){
             System.out.print(buf[i]+" ");
        }
        System.out.print(buf[buf.length-1]);
    }
}