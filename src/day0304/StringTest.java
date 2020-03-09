class StringTest {
    public static void sop(String s) {
        System.out.println(s);
    }

    public static String myTrim(String str) {
        int start = 0, end = str.length()-1;
        while(start <= end && str.charAt(start) == ' ') {
            start ++;
        }
        while (start <= end && str.charAt(end) == ' ') {
            end--;
        }
        return str.substring(start, end+1);
    }

    public static void main(String[] args) {
        String s = "    ab   cd   ";
        sop(s);
        s = myTrim(s);
        sop(s);
        String s1 = "asdfgh";
        sop(s1);
        s1 =  reverseString(s1,0, s1.length()-1);
        sop(s1);
    }

    public static String reverseString(String s, int start, int end) {
        char[] chs = s.toCharArray();
        reverse(chs, start, end);
        return new String(chs);
    }

    public static void reverse(char[] arr, int x, int y) {
        for (int start = x, end = y; start < end; start++, end--) {
            swap(arr, start, end);
        }
    }
    private static void swap(char[] arr, int x, int y) {
        char temp = arr[x];
        arr[x] =arr[y];
        arr[y] = temp;
    }
}