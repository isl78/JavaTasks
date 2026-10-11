package secondAssignment;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        if (a!=0) {
            int x = -b / a;
            if (a * x + b == 0 && c*x+d!=0)  System.out.println(x);
            else System.out.println("NO");

        } else if (a==0) {
            if (b==0 ) System.out.println("INF");
            else System.out.println("NO");
        }

    }
}
