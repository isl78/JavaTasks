package secondAssignment;

import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        if (k>=n) System.out.println(m*2);
        else System.out.println((2 * n + k - 1) / k * m);
    }
}
