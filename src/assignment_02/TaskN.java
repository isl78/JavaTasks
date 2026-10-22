package assignment_02;

import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a>b) System.out.println(a);
        else if (a<b) System.out.println(b);
        else System.out.println(a);
    }
}
