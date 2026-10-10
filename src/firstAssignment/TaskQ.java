package firstAssignment;

import java.util.Scanner;

public class TaskQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int res = (a+b-1)/a;
        System.out.println(res);
    }
}
