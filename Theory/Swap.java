package Theory;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap2(a, b);
    }
    static void  swap2(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + " b = " + b);
    }
}
