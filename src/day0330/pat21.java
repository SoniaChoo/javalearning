import java.util.*;

class pat21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte[] buf = scan.next().getBytes();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        Integer v = 0;
        for (int i = 0; i < buf.length; i++) {
            //System.out.println(buf[i]-'0');
            v = hm.getOrDefault(buf[i]-'0', 0);
            // if (hm.containsKey(buf[i]-'0')){
            //     v = hm.get(buf[i]-'0');
            // }
            hm.put(buf[i]-'0',++v);
            v = 0;
        }
        List<Integer> keyList = new ArrayList<Integer>(hm.keySet());
        Collections.sort(keyList);
        for (Integer i:keyList) {
            System.out.println(i+":"+hm.get(i));
        }
    }
}