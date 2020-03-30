import java.util.*;

class pat03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String count = scan.nextLine();
        int n = Integer.parseInt(count);
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
                String s = scan.nextLine();
                int p = s.indexOf("P");
                int t = s.indexOf("T");
                int cp = countChar(s,'P');
                int ct = countChar(s,'T');
                int ca = countChar(s,'A');
            if (cp != 1 || ct != 1) {
                res[i] = "NO";
                continue;
                }
            if (ca != 0 && ca == s.length()-2 && p*(t-p-1)==s.length()-1-t) {
                res[i] = "YES";
            } else{
                res[i] = "NO";
            }
    }
    for (int i = 0; i < res.length;i++) {
        System.out.println(res[i]);
    }
}

    public static int countChar(String s, char c) {
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) {
                count++;
            }
        }
        return count;
    }
}