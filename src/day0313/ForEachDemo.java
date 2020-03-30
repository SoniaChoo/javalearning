import java.util.*;

class ForEachDemo {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        
        for (String s:al){
            System.out.println(s);
        }
        System.out.println(al);

        int[] arr = {3, 5, 1};
        for (int i:arr){
            System.out.println(i);
        }

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");

        Set<Integer> keyset = hm.keySet();
        for (Integer key:keyset) {
            System.out.println(key+":::"+hm.get(key));
        }

        Set<Map.Entry<Integer,String>> entryset = hm.entrySet();
        for (Map.Entry<Integer,String> me:entryset){
            System.out.println(me.getKey()+">>>"+me.getValue());
        }
    }

    /*
高级for循环

格式：
for(数据类型 变量名 : 被遍历的集合(Collection)或者数组)
{
	
}

对集合进行遍历。
只能获取集合元素。但是不能对集合进行操作。

迭代器除了遍历，还可以进行remove集合中元素的动作。
如果是用ListIterator，还可以在遍历过程中对集合进行增删改查的动作。

传统for和高级for有什么区别呢？

高级for有一个局限性。必须有被遍历的目标。

建议在遍历数组的时候，还是希望是用传统for。因为传统for可以定义脚标。


*/
}