import java.util.*;

class pat36 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < n; i++){
            sb1.append(s);
            if (i == 0 || i == n-1){
                sb2.append(s);
            }else{
                sb2.append(" ");
            }
        }
        int row = n/2;
        if (n % 2 >= 1){
            row++;
        }
        for (int i = 0; i < row; i++){
            if (i == 0 || i == row - 1){
                System.out.println(sb1);
            }else{
                System.out.println(sb2);
            }
        }
    }
}