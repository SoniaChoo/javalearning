import java.util.*;
import java.lang.*;

//这道题需要注意的点有：
// 1.正数和正整数的坑
// 2.所有月饼库存总和不满足需求

// 测试点2考察库存不为整数
// 测试点3考察所有月饼库存总和不满足需求

class pat20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kind = scan.nextInt();
        float q = scan.nextFloat();
        TreeSet<moon> ts = new TreeSet<moon>();
        // String str1 = scan.nextLine();
        String temp = scan.nextLine();
        String[] arr1 = scan.nextLine().split(" ");
        String[] arr2 = scan.nextLine().split(" ");
        //System.out.println(str1);
        // for (int i = 0; i< arr1.length; i++){
        //     System.out.println("~~~~~~~");
        //     System.out.println(arr1[i]);
        //     System.out.println("?????");
        // }
        float totalNumber = 0;
        float totalPrice = 0;
        for (int i = 0; i < arr1.length; i++){
            float number = Float.parseFloat(arr1[i]);
            float price = Float.parseFloat(arr2[i]);
            float unitPrice = (float)price/(float)number;
            ts.add(new moon(number,price,unitPrice));
            totalNumber += number;
            totalPrice += price;
        }
        if (totalNumber <= q) {
            System.out.printf("%.2f", totalPrice);
            return;
        }
        float sales = 0;
        
        while (true){
            moon m = ts.pollLast();
            if (m.getNumber() > q){
                sales += (float)(q* m.getPrice()/(float)m.getNumber());
                //System.out.println(sales);
                System.out.printf("%.2f",sales);
                return;
            }
            q = q - m.getNumber();
            sales += m.getPrice();
            //System.out.println(sales);
        }
    }

    public static int[] stringToInt(String[] arr){
        int[] buf = new  int[arr.length];
        for (int i = 0; i < arr.length; i++){
            buf[i] = Integer.parseInt(arr[i]);
        }
        return buf;
    }
}

class moon implements Comparable{
    private float number;
    private float price;
    private float unitPrice;
    public moon(float number,float price,float unitPrice){
        this.number = number;
        this.price = price;
        this.unitPrice = unitPrice;
    }

    public float getNumber(){
        return this.number;
    }

    public float getPrice(){
        return this.price;
    }
    
    public float getUnitPrice(){
        return this.unitPrice;
    }

    public int compareTo(Object obj){
        if (!(obj instanceof moon)){
            throw new RuntimeException("failed");
        }
        moon m = (moon)obj;
        if (this.getUnitPrice() > m.getUnitPrice()) {
            return 1;
        }else if (this.getUnitPrice() < m.getUnitPrice()) {
            return -1;
        }
        return 0;
    }
}