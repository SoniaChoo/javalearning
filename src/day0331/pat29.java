import java.util.*;

class pat29 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char[] buf1 = scan.next().toUpperCase().toCharArray();
        char[] buf2 = scan.next().toUpperCase().toCharArray();
        HashMap<Character,Boolean> hm1 = new HashMap<Character,Boolean>();
        ArrayList<Character> al = new ArrayList<Character>();
        for (int i = 0; i < buf2.length;i++){
            hm1.putIfAbsent(buf2[i],true);
        }

        for (int i = 0; i < buf1.length;i++){
             if (!(hm1.containsKey(buf1[i])) && !(al.contains(buf1[i]))) {
                 al.add(buf1[i]);
            }
        }

        for (Character c:al){
            System.out.print(c);
        }
    }
}