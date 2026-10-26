package assignment_04;

import java.util.Scanner;

public class TaskF {
    public static boolean isPrime(int a) {
        int cnt = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) cnt++;
        }
        return cnt == 2;
    }

    public static int rangePrime(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num1 = input.nextInt();
        System.out.println("Prime Count = " + rangePrime(num, num1));
    }
}
