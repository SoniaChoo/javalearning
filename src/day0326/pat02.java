import java.util.*;

class pat02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte[] b = new byte[1024];
        if (scan.hasNext()){
            String s = scan.next();
            b = s.getBytes();
        }
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i]-'0';
            System.out.println(b[i]-'0');
        }
        //System.out.println(Arrays.toString(b));
        //System.out.println(b);
        String[] arr = {"ling","yi","er","san", "si", "wu", "liu","qi","ba","jiu"};
        StringBuilder sb = new StringBuilder();
        while (sum != 0) {
            int temp = sum % 10;
            sb.insert(0, arr[temp]+" ");
            sum = sum/10;
        }
        System.out.println(sb.toString().trim());
        //System.out.println(sb.toString());
    }
}