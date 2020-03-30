import java.util.*;

class pat18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String,Integer> hma = new HashMap<String,Integer>();
        HashMap<String,Integer> hmb = new HashMap<String,Integer>();
        hma.put("B",0);
        hma.put("C",0);
        hma.put("J",0);
        hmb.put("B",0);
        hmb.put("C",0);
        hmb.put("J",0);
        int sheng = 0;
        int ping = 0;
        int fu = 0;
        for (int i = 0; i < n; i++) {
            String a = scan.next();
            String b = scan.next();
            //System.out.print("---------"+a+" VS "+b);
            String result = helper(a, b);
           // System.out.println("-----result" + result);
            if (helper(a,b) == a) {
                //System.out.println("A win!");
                int v = hma.get(a);
                hma.put(a,++v);
                sheng++;
            }else if (helper(a,b) == b) {
                //System.out.println("B win!");
                int v = hmb.get(b);
                hmb.put(b,++v);
                fu++;
            }else{
                ping++;
            }                    
        }
        //System.out.println(hma);
        System.out.println(sheng+" "+ping+" "+fu);
        System.out.println(fu+" "+ping+" "+sheng);
        String maxa = maxChance(hma);
        String maxb = maxChance(hmb);
        System.out.println(maxa+" "+maxb);
    }

    public static String helper(String a, String b){
        if(a.equals("C") && b.equals("J")){
            return a;
        }else if (a.equals("C") && b.equals("B")){
            return b;
        }else if (a.equals("J") && b.equals("C")){
            return b;
        }else if(a.equals("J") && b.equals("B")) {
            return a;
        }else if (a.equals("B") && b.equals("J")) {
            return b;
        }else if (a.equals("B") && b.equals("C")) {
            return a;
        } else {
            return "0";
        }
    }

    public static  String maxChance(HashMap<String,Integer> hm){
        int max = 0;
        String res = "J";
        Set<Map.Entry<String,Integer>> entryset = hm.entrySet();
        for (Map.Entry<String,Integer> me:entryset){
            int value = me.getValue();
            String key = me.getKey();
            if (value > max){
                max = value;
                res = key;
            }else if (value == max) {
                if (key.compareTo(res) < 0){
                    max = value;
                    res = key;
                }
            }
        }
        return res;
    }
}