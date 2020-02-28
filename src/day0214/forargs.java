package day0214;
public class forargs {
    public static void main(String[] args) {
        short s = 3;
        //s=s+2;  // 错误: 不兼容的类型: 从int转换到short可能会有损失
        s+=2;  // correct
        System.out.println(s);
    }
}