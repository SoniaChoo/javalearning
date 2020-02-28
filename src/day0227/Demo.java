class Demo {
    public static void main(String[] args) {
        int x = 4;
        char ch = getLevel(35);
        System.out.println(ch);
        System.out.println(x);
    }

    public static void show(int x) {
        x = 2;
    }

    public static char getLevel(int num) {
        char level;
        if (num>=90 && num <= 100) {
            level = 'A';
        }
        else if (num >= 80 && num < 90){
            level = 'B';
        }
        else if (num >= 70 && num < 79) {
            level = 'C';
        }
        else if (num >= 60 && num < 69) {
            level = 'D';
        }
        else {
            level = 'E';
        }
        return level;
    }
}