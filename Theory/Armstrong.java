package Theory;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = IsArmstrong(n);
        System.out.println(ans);
    }

    static boolean IsArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int digit = n % 10;     // last digit
            sum += digit * digit * digit;  // cube add
            n = n / 10;             // remove last digit
        }

        return sum == original;  // agar same to true warna false
    }
}