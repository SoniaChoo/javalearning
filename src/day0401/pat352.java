class pat352 {
    public static void main(String[] args) {
	int[] list = {3,1,2,8, 7, 5, 9, 4, 6, 0};
	MergeSort(list);
	for(int num:list)
		System.out.print(num);

}
public static void MergeSort(int[] list){
	int len = 1;
	int[] temp = new int[list.length];
	while(len<list.length){
		MergePass(list, temp, list.length, len);
		len = len*2;
		if(len>=list.length){
			for(int i =0;i<list.length;i++)
				list[i] = temp[i];
			
				
			}
		else{
			MergePass(temp, list, list.length, len);
			len = len*2;
		}
	}
	
}

public static void Merge(int[] list, int[] temp, int i, int m, int n){
	int k = i, j = m+1;
	for(;i<=m&&j<=n;k++){
		if(list[i]<=list[j])
			temp[k] = list[i++];
		else{
			temp[k] = list[j++];
		}
	}
	while(i<=m)
		temp[k++] = list[i++];
	while(j<=n)
		temp[k++] = list[j++];
}
public static void MergePass(int[] list, int[] temp, int n, int len){
	int i =0;
	while(i<=n-len*2){
		Merge(list, temp, i, i+len-1, i+len*2-1);
		i = i+len*2;
	}
	if(i<n-len){
		Merge(list, temp, i, i+len-1, n-1);
	}
	else{
		for(int j =i;j<n;j++){
			temp[j] = list[j];
		}
	}
}
}