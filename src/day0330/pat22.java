import java.util.*;

class pat22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int d = scan.nextInt();
        int c = a+b;
        if (c == 0){
            System.out.println(0);
            return;
        }
        int base = d-1;
        int offset = 0;
        while(d != 1){
            d = d/2;
            offset++;
        }
       // System.out.println(count+" "+c+" "+;
        //transTo(60,4,15);
        transTo(c,offset,base);
        
    }


    public static void transTo(int num, int offset, int base) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] arr = new char[32];
        int pos = arr.length;
        while (num != 0) {
            int temp = num & base;
            arr[--pos] = map[temp];
            num = num >>> offset;
        }
        for (int i = pos; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}