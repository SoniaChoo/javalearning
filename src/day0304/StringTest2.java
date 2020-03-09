class StringTest2 {
    public static int getSubCount(String str, String key) {
        int count = 0; 
        int index = 0;
        while((index = str.indexOf(key)) != -1) {
            System.out.println("str="+str);
            str = str.substring(index+key.length());
            count++;
        }
        return count;
    }

        public static void main(String[] args) {
            String str = "kkabkkcdkkefkks";
           int count = getSubCount_2(str, "kk");
            System.out.println(count);
           // System.out.println(str.split("kk").length);
        }

    public static int getSubCount_2(String str, String key) {
        int count = 0; 
        int index = 0;
        while ((index = str.indexOf(key, index)) != -1) {
            index += key.length();
            count++;
        }
        return count;
    }    
}