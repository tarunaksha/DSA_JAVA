package numbers;

import java.util.*;

public class FiboRecurFirst {
    static int n1 = 0, n2 = 1, n3 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFib(n);
        sc.close();
    }
    static void printFib(int n){
        if(n>0){
            System.out.print(n3+" ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            printFib(n-1);
        }
    }
}
