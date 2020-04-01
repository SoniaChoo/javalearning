import java.util.*;

class pat28{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        String old = "1814/09/06";
        String young = "2014/09/06";
        String mostOld = "2014/09/06";
        String mostOldName = "";
        String mostYoung = "1814/09/06";
        String mostYoungName = "";
        for (int i = 0; i < n; i++){
            String name = scan.next();
            String birth = scan.next();
            int c1 = birth.compareTo(young);
            int c2 = birth.compareTo(old);
            
            //System.out.println(c1+" "+c2);
            if (c1 == 1 || c2 == -1){
                continue;
            }
            count++;
            if (birth.compareTo(mostOld) == -1) {
                mostOld = birth;
                mostOldName = name;
            }
            if (birth.compareTo(mostYoung) == 1) {
                mostYoung = birth;
                mostYoungName = name;
            }
        }
        if (count == 0){
            System.out.println(count);
            return;
        }
        //System.out.println()
        System.out.println(count+" "+mostOldName+" "+mostYoungName);
    }
}