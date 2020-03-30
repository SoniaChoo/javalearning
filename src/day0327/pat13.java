import java.util.*;

class pat13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int count = 0;
        for (int i = 2; count != n; i++) {
            if (!(isPrime(i))) {
                continue;
            }
            count++;
            if (count >= m && count < n) {
                System.out.print(i);
                if (count % 10 != m-1 ) {
                    System.out.print(" ");
                }else {
                    System.out.println();
                }
            }
            if (count == n){
                System.out.print(i);
            }
        }
    }

    public static boolean isPrime(int x){
        if (x == 2) {
            return true;
        }
        for (int i= 2; i*i<= x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
