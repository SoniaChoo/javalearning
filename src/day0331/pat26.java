import java.util.*;

class pat26 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int time = (end -start)/100;
        int remain = (end-start)%100;
        if (remain >= 50){
            time++;
        }
        int hour = time/3600;
        int minute = (time%3600)/60;
        int second = (time%3600)%60;
        System.out.printf("%02d:%02d:%02d",hour,minute,second);
    }
}