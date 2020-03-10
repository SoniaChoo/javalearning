import java.util.*;

class GenericDemo3 {
    public static void main(String[] args) {
        Utils<Worker> u = new Utils<Worker>();
        u.setObject(new Worker());
        Worker w = u.getObject();
    }
}

class Student{

}

class Worker{

}

class Utils<QQ> {
    private QQ q;
    public void setObject(QQ q) {
        this.q = q;
    }
    public QQ getObject(){
        return q;
    }
}