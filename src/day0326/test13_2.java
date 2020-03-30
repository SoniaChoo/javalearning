class test13_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] arr = {2,4,1,4,3,2,4,3,2,4};
        int count = 0;
        int maxcount = 1;
        for(int x = 0; x < arr.length; x++) {
            for (int y = x+1;y < arr.length;y++) {
                if(arr[x] == arr[y]) {
                    count++;
                }
            }
            if (count > maxcount) {
                sb.delete(0,sb.length());
                sb.append(arr[x]+" ");
                maxcount = count;
            }else if (count == maxcount) {
                sb.append(arr[x]+" ");
            }
            count = 0;
        }
        System.out.println(sb);
    }
}