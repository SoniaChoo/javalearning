import java.util.*;

class pat25 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String  start = scan.next();
        int l = scan.nextInt();
        int k = scan.nextInt();
        scan.nextLine();
        TreeSet<Node> ts = new TreeSet<Node>();
        for (int i = 0; i < l; i++){
            String[] arr = scan.nextLine().split(" ");
            int address = Integer.parseInt(arr[0]);
            int data = Integer.parseInt(arr[1]);
            int next = Integer.parseInt(arr[2]);
            ts.add(new Node(address,data,next));
        }
        ArrayList<Node> al = new ArrayList<Node>(ts);
        LinkedList<Node> l1 = new LinkedList<Node>();
        //System.out.println(al.size());
        if (k == 0){
            for (int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
             }
             return;
        }
        int reverseTime = l/k;
        for (int i = 0; i < reverseTime;i++){
            for (int j = k-1;j >=0; j--){
                l1.add(al.remove(j));
            }
        }

        for (Node node:al){
            l1.add(node);
        }
         int tempAddress = -1;
        for (int i = l-1; i>=0; i--) {
            l1.get(i).setNext(tempAddress);
            tempAddress = l1.get(i).getAddress();
        }

        for (Node node:l1){
            System.out.println(node);
        }

    }
}

class Node implements Comparable{
    private int address;
    private int data;
    private int next;

    public Node(int address, int data,int next){
        this.address = address;
        this.data = data;
        this.next = next;
    }

    public int getAddress() {
        return this.address;
    }

    public int getData() {
        return this.data;
    }

    public int getNext(){
        return this.next;
    }

    public void setNext(int n){
        this.next = n;
    }

    public int compareTo(Object obj){
        if (!(obj instanceof Node)){
            throw new RuntimeException("failed");
        }
        Node node = (Node)obj;
        if (this.data > node.data){
            return 1;
        }else if (this.data < node.data) {
            return -1;
        }
        return 0;
    }

    public String toString(){
        if (this.next == -1){
            return String.format("%05d",address)+" " + data +" "+String.format("%02d",next);
        }else {
            return String.format("%05d",address)+" "+data+" "+String.format("%05d",next);
        }
    }
}
