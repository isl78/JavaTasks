package secondAssignment;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a == 1 || a % 4 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
