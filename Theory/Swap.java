package Theory;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
        swap2(a, b);
    }
    static void  swap2(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + " b = " + b);
    }
}
