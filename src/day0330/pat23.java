import java.util.*;

class pat23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] buf = new int[10];
        int[] res = new int[50];
        int pos = -1;
        for (int i = 0; i <10; i++) {
            buf[i] = scan.nextInt();
            for (int j = 0; j < buf[i]; j++){
                res[++pos] = i; 
            }
            //System.out.print(buf[i]);
        }
        int j = 0;
        for (j = 0; j <res.length ; j++){
            if (res[j] != 0){
                int temp = res[j];
                res[j] = res[0];
                res[0] = temp;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= pos; i++){
            sb.append(res[i]);
        }
        System.out.println(sb);
        
        // byte[] res = new byte[50];
        // int pos = 0;
        // if j  == 0{
        //     for (int i=1; i<buf[])
        // }
    }
}