import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int hashCode(){
        return name.hashCode()+age*34;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Student)){
            throw new ClassCastException("leixing bu pipei");
        }
        Student s = (Student)obj;
        return this.name.equals(s.name) && this.age == s.age;
    }

    public int compareTo(Student s) {
        int num = new Integer(this.age).compareTo(new Integer(s.age));
        if (num == 0){
            return this.name.compareTo(s.name);
        }
        return num;
    }
    
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return name + ":"+ age;
    }
}

class MapTest {
    public static void main(String[] args){
        HashMap<Student,String> hm = new HashMap<Student,String>();
        hm.put(new Student("lisi1",21),"beijing");
		hm.put(new Student("lisi1",21),"tianjin");
		hm.put(new Student("lisi2",22),"shanghai");
		hm.put(new Student("lisi3",23),"nanjing");
		hm.put(new Student("lisi4",24),"wuhan");


        //the first way keyset
        System.out.println(hm.size());
        Set<Student> keyset = hm.keySet();
        // Iterator<Student> it = keyset.iterator();
        // while(it.hasNext()){
        //     Student key = it.next();
        //     System.out.println(key +".."+hm.get(key));
        // } 
        for(Student s : keyset){
            System.out.println(s + ">>>"+hm.get(s));
        }

        //the second way entrySet
        Set<Map.Entry<Student,String>> entryset = hm.entrySet();
        for(Map.Entry<Student,String> me:entryset){
            System.out.println(me.getKey() + "~~~~" + me.getValue());
        }
    }
}