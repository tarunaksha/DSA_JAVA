package numbers;

import java.util.Scanner;

public class FiboRecurSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printFib(n));
        sc.close();
    }
    static int printFib(int n){
        if(n==0 || n==1){
            return n;
        }
        return printFib(n-1) + printFib(n-2);
    }
}
