package Theory;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = Isprime(n);
        System.out.println(ans);

    }
    static boolean Isprime(int n){
        if(n<=1){
         return false;
        }
        int i = 2;
        while(i*i<=n){
        if(n%2 == 0){
            return false;
        }
          i++;
        }
        if(i*i>n){
            return true;
        } 
        return false;
    }
}
