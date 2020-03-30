import java.util.*;

public class test13 {
	public static void main(String[] args) {
		Map<Integer,Integer> m1 = new HashMap();
		int[] arr = {2,4,1,4,3,2,4,3,2,4};
		Integer maxCount = 0;
		Integer maxKey = arr[0];
		for (int i = 0; i < arr.length; i++) {
			Integer v = 0;
			if (m1.containsKey(arr[i])) {
				v = m1.get(arr[i]);
			}
			m1.put(arr[i], ++v);
			if (v > maxCount) {
				maxKey = arr[i];
			}
		}
		// Set<Map.Entry<Integer,Integer>> entrySet = m1.entrySet();
		// for (Map.Entry<Integer,Integer> me:entrySet) {
		// 	if (me.getValue() > maxCount) {
		// 		maxCount = me.getValue();
		// 		maxKey = me.getKey();
		// 	}
		// }
		System.out.println(maxKey);
	}
}