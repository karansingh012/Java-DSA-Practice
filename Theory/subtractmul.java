package Theory;

import java.util.Scanner;

// subtract-the-product-and-sum-of-digits-of-an-integer
public class subtractmul {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int r1 = product(n);
        int r2 = addition(n);
      int result = r1-r2;
        System.out.println(result);
    }
    static int product(int n){
         int mul = 1;
        while(n>0){
           int rem = n%10;
            mul *= rem;
            n = n/10;
        }
        return mul;
    }
    static int addition(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
}
