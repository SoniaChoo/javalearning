import java.util.*;

class pat04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lineCount = scan.nextLine();
        int n = Integer.parseInt(lineCount);
        TreeSet<Student> set = new TreeSet<Student>();
        for (int i = 0; i < n;i++) {
            String temp = scan.nextLine();
            String[] buf = temp.split(" ");
            Student s = new Student(buf[0], buf[1], Integer.parseInt(buf[2]));
            set.add(s);
        }
        //ArrayList<Student> al = new ArrayList<Student>(set);
        System.out.println(set.first().getName()+" "+set.first().getId());
        System.out.println(set.last().getName()+" "+ set.last().getId());
        //System.out.println(al.get(al.length-1).getName());
    }
}

// public class Comp implements Comparator<Student>{
//     public int compare(Object o1, Object o2) {
//         Student s1 = (Student)o1;
//         Student s2 = (Student)o2;
//         return new Integer(s1.getScore).compareTo(new Integer(s2.score));
//     }
// }

class Student implements Comparable{
   private String name;
   private String id;
   private int score;
    Student(String name,String id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public int compareTo(Object obj){
        if (!(obj instanceof Student)) {
            throw new RuntimeException("not student");
        }
        Student s = (Student)obj;
        if (this.score > s.score) {
            return -1;
        }else if (this.score < s.score){
            return 1;
        }
        return 0;
    }

    public  String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getScore(){
        return score;
    }
}