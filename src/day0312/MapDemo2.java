import java.util.*;

class MapDemo2 {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();
        map.put("02","zhangsan2");
        map.put("03","zhangsan3");
        map.put("01","zhangsan1");
        map.put("04","zhangsan4");
        Set<String> keyset = map.keySet();
        // Iterator<String> it = keyset.iterator();
        // while(it.hasNext()){
        //     String key = it.next();
        //     String value = map.get(key);
        //     System.out.println("key:"+key+",value:"+value);
        // }
        for(String key:keyset) {
            System.out.println(key+":::"+map.get(key));
        }

        Set<Map.Entry<String,String>> entryset = map.entrySet();
        for(Map.Entry<String, String> x:entryset){
            System.out.println(x.getKey()+"::::"+x.getValue());
        }
        Iterator<Map.Entry<String,String>> it1 = entryset.iterator();
        while (it1.hasNext()){
            Map.Entry<String,String> me = it1.next();
            System.out.println(me.getKey()+">>>>"+me.getValue());
           //经典错误!!!// System.out.println(it1.next().getKey()+">>>>"+it1.next().getValue());
        }
    }
}

interface Map {
    public static interface Entry {
        public abstract Object getKey();
        public abstract Object getValue();
    }
}

class HashMap implements Map{
    class Hahs implements Map.Entry {
        public Object getKey(){}
        public Object getValue(){}
    }
}

