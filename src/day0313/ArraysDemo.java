/*
Arrays:用于操作数组的工具类。
里面都是静态方法。


asList:将数组变成list集合
*/

import java.util.*;
class ArraysDemo {
    public static void main(String[] args){
        // int[] arr = {2, 4, 5};
        // System.out.println(Arrays.toString(arr));

        String[] arr = {"abc","cc","kkkk"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        //int[] nums = {2, 4, 5};
        //List<int[]> numlist = Arrays.asList(nums);
        Integer[] nums = {2,4, 5};
        List<Integer> numlist = Arrays.asList(nums);
        System.out.println(numlist);
    }
    //把数组变成list集合有什么好处？
		/*
		可以使用集合的思想和方法来操作数组中的元素。

		注意：将数组变成集合，不可以使用集合的增删方法。
		因为数组的长度是固定。
		contains。
		get
		indexOf()
		subList();

		如果你增删。那么会反生UnsupportedOperationException,



    
    /*
		如果数组中的元素都是对象。那么变成集合时，数组中的元素就直接转成集合中的元素。
		如果数组中的元素都是基本数据类型，那么会将该数组作为集合中的元素存在。
		*/
		sop(li);



	}
	public static boolean myContains(String[] arr,String key)
	{
		for(int x=0;x<arr.length; x++)
		{
			if(arr[x].equals(key))
				return true;
		}
		return false;
	}
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}