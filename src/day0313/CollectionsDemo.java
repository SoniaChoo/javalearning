import java.util.*;
class CollectionsDemo {
    public static void main(String[] args){
        //binarySearchDemo();
        //maxDemo();
        sortDemo();
    }

    public static void binarySearchDemo(){
        List<String> list = new ArrayList<String>();
        list.add("abcd");
        list.add("aaa");
        list.add("zz");
        list.add("qq");
        list.add("z");
        Collections.sort(list,new StrLenComp());
        sop(list);
        
        int index = halfSearch2(list,"kkk", new StrLenComp());
        //sop(list);
        sop(index);
        
    }

    public static int halfSearch(List<String> list, String key) {
        int max, min, mid;
        max = list.size()-1;
        min = 0;
        while(min <= max) {
            mid = (min+max)>>1;
            String str = list.get(mid);
            int num = str.compareTo(key);
            if (num>0) {
                max = mid -1;
            }
            else if (num < 0){
                min = mid+1;
            }
            else {
                 return mid;
            }
        }
        return -min-1;
    }

    public static int halfSearch2(List<String> list, String key, Comparator<String> comp) {
        int max, min, mid;
        max = list.size();
        min = 0;
        while (min <= max){
            mid = (min+max)>>1;
            String str = list.get(mid);
            int num = comp.compare(str, key);
            if (num > 0) {
                max = mid-1;
            }
            else if (num < 0) {
                min = mid+1;
            }
            else {
                return mid;
            }
        }
        return -min-1;
    }

    public static void sop(Object obj){
        System.out.println(obj);
    }

    public static void maxDemo(){
        List<String> list = new ArrayList<String>();
        list.add("abcd");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");
		list.add("qq");
		list.add("z");
        Collections.sort(list,new StrLenComp());
        sop(list);
        String max = Collections.max(list,new StrLenComp());
        sop(max);
    }

    public static void sortDemo(){
        List<String> list = new ArrayList<String>();
        list.add("abcd");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");
		list.add("qq");
		list.add("z");
		
		sop(list);
        Collections.sort(list,new StrLenComp());
        Collections.swap(list,1,2);
        sop(list);
    }
}

class StrLenComp implements Comparator<String> {
    public int compare(String s1, String s2){
        int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));
        if (num == 0){
            return s1.compareTo(s2);
        }
        return num;
    }
}