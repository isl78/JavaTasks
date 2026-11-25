package assignment_06;

import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] parts = input.nextLine().trim().split(" +");

        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);

        if (op.equals("+")) {
            System.out.println(a + b);
        } else if (op.equals("-")) {
            System.out.println(a - b);
        } else if (op.equals("*")) {
            System.out.println(a * b);
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Division by zero");
            } else {
                System.out.println(a / b);
            }
        }
    }
}
