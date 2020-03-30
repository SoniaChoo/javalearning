import java.util.Scanner;

class pat01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        if (scan.hasNext()) {
            String s = scan.next();
            n = Integer.parseInt(s);
        }
        int count = 0;
        while ( n != 1){
            if (n % 2 == 0) {
                n = n/2;
            }else {
                n = (3 * n + 1)/2;
            }
            count++;
        }
        System.out.println(count);
    }
}