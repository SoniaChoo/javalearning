import java.util.*;
import java.lang.Character;
class pat14 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         char[] buf1 = scan.nextLine().toCharArray();
         char[] buf2 = scan.nextLine().toCharArray();
         char[] buf3 = scan.nextLine().toCharArray();
         char[] buf4 = scan.nextLine().toCharArray();
         String[] arr1 = {"MON","TUE","WED", "THU", "FRI", "SAT", "SUN"};
         String part1 = "";
         int part2 = 0;
         int part3 = 0;
         boolean flag = false;
         for (int i = 0; i < min(buf1.length, buf2.length); i++) {
             if (buf1[i] == buf2[i] && flag == false) {
                 //System.out.println(buf1[i]);
                 if (buf1[i] >= 'A' && buf1[i] <= 'G') {
                    int day = buf1[i]-'A';
                    part1 = arr1[day];
                    flag = true;
                 }
                    continue;
             }
             if ((buf1[i] == buf2[i]) && flag == true) {
                if (buf1[i] >='A' && buf1[i] <= 'N'){
                    //System.out.println(buf1[i]);
                    part2 = buf1[i]- 'A'+10;
                    break;
                }else if (Character.isDigit(buf1[i])){
                    part2 = buf1[i]-'0';
                    break;
                }
             }
        }

        for (int i = 0; i < min(buf3.length,buf4.length);i++) {
            if (buf3[i] == buf4[i]) {
                //System.out.println(buf3[i]);
                if  (Character.isLetter(buf3[i])) {
                    part3 = i;
                    break;
                }
            }
        }
        if (part3 >= 10) {
            System.out.printf("%s %2d:%2d",part1,part2,part3);
        }else{
            System.out.printf("%s %2d:%02d",part1,part2,part3);
        }
    }

    public static int min(int a, int b){
        if (a > b) {
            return b;
        }
        return a;
    }
}