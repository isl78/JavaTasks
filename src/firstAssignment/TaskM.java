package firstAssignment;

import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(),temp;
        int b = input.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}
