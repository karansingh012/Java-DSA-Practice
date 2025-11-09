package Theory;

import java.util.Scanner;

public class FunctionsMethod {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);

    }
        static int sum2(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
          return c;
        
    }
}
