package numbers;

import java.util.Scanner;

public class FibonacciNormal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 0, num2 = 1;
        int num3 = 0;
        for (int i = 0; i < n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(num3);
        sc.close();
    }
}
