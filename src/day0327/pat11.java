import java.util.*;

class pat11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //String[] buf = new String[n];
        for (int i = 0; i < n; i++) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();//如果是用int就会溢出了.
            if (a + b > c) {
                System.out.printf("Case #%d: true\n",i+1);
            }else {
                System.out.printf("Case #%d: false\n",i+1);
            }
        }
    }
}