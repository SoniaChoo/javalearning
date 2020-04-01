import java.util.*;

class pat27 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        String s = scan.next();
        int level = 1;
        if (n == 1){
            System.out.println(s);
            System.out.println(0);
            return;
        }
        while (2*level*level-1 <= n){
            level++;
        }
        level--;
        int remain = n-2*level*level+1;
        //System.out.println(level);
        for (int i = level;i > 0;i--){
            for (int z = 0; z < level-i;z++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++){
                System.out.print(s);
            }
            System.out.println();
        }
        for (int i = 2; i <= level; i++){
            for (int z = 0; z < level-i;z++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1;j++){
                System.out.print(s);
            }
            System.out.println();
        }
        
        System.out.println(remain);
    }
}
