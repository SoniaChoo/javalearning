import java.util.*;

class Studnent {
    private String id;
    private String name;
    Studnent(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return id+":::"+name;
    }
}

class MapDemo3 {
    public static void demo(){
        HashMap<String, List<Studnent>> czbk = new HashMap<String, List<Studnent>>();
        List<Studnent> yure = new ArrayList<Studnent>();
        List<Studnent> jiuye = new ArrayList<Studnent>();

        czbk.put("yureban",yure);
        czbk.put("jiuye",jiuye);

        yure.add(new Studnent("01","zhangsan"));
        yure.add(new Studnent("04","wangwu"));
        jiuye.add(new Studnent("01","zhouqi"));
        jiuye.add(new Studnent("02","zhaoli"));

        Iterator<String> it = czbk.keySet().iterator();
        while(it.hasNext()){
            String roomname = it.next();
            List <Studnent> room = czbk.get(roomname);
            System.out.println(roomname);

            Iterator<Studnent> it1 = room.iterator();
            while (it1.hasNext()){
                Studnent s = it1.next();
                System.out.println(s);
                
            }
        }

    }
    public static void main(String[] args){
        demo();
    }
}
