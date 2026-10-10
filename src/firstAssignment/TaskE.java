package firstAssignment;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        int result = ((a * b) % 109 + 109) % 109;
        System.out.println(result);
    }
}
