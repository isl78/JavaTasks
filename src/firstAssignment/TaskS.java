package firstAssignment;

import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int days = (int) Math.ceil(((double)c - a) / (a - b)) + 1;
        System.out.println(days);
    }
}
