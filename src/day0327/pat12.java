import java.util.*;

class pat12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a1 =0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a22 = 0;
        int flag = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
               int temp = scan.nextInt();
               if (temp%10 == 0) {
                   a1 += temp;
               }else if (temp % 5 == 1) {
                   a2 += flag*temp;
                   a22++;
                   if (flag == 1){
                       flag = -1;
                   }else{
                       flag = 1;
                   }
                   
               }else if (temp % 5 == 2){
                   a3++;
               }else if (temp%5 == 3) {
                   a4 += temp;
                   count++;
               }else if (temp % 5 == 4) {
                   if (temp > a5) {
                       a5 =temp;
                   }
               }
        }
    
        String resa1 = "";
        String resa2 = "";
        String resa3 = "";
        String resa4 = "";
        String resa5 = "";
        if (a1 == 0) {
           System.out.print("N"+" ");
        }else {
            System.out.print(a1 + " ");
        }
        if (a22 == 0) {
           System.out.print("N"+" ");
        }else{
            System.out.print(a2+" ");
        }
        if (a3 == 0){
            System.out.print("N"+" ");
        }else{
            System.out.print(a3+" ");
        }
        if (count == 0) {
            System.out.print("N"+" ");
        }else {
            System.out.printf("%.1f ",(float)a4/(float)count);
        }
        if (a5 == 0) {
            System.out.print("N");
        }else {
            System.out.print(a5);
        }
        // System.out.println(a4);
        // System.out.println(count);
        // System.out.printf("%d %d %d %.1f %d",a1,a2,a3,(float)a4/(float)count,a5);
    }
}