import java.util.*;

class pat10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] buf = scan.nextLine().split(" ");

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < buf.length; i++) {
            al.add(Integer.parseInt(buf[i]));
        }
        if (al.size() == 2 && al.get(1)*al.get(0) == 0) {
            System.out.println("0 0");
            return;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i <= al.size()-2;i = i + 2) {
            if (al.get(i+1)== 0 && al.get(i) != 0) {
                //System.out.println(i+1);
                continue;
            }else if (al.get(i+1) != 0 && al.get(i) == 0) {
                //System.out.println(i+1);
                continue;
            }else if (al.get(i+1) == 0 && al.get(i) == 0) {
                res.add(0);
                res.add(0);
                continue;
            }

            int part1 = al.get(i)*al.get(i+1);
            int part2 = al.get(i+1)-1;
            res.add(part1);
            res.add(part2);
        }
       //System.out.println(res);
        for (int i = 0; i < res.size()-1;i++) {
            System.out.print(res.get(i)+" ");
        }
        System.out.print(res.get(res.size()-1));
    }
}