package assignment_02;

import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a == 1 || a == 2 || a == 4 || a == 7) System.out.println("NO");
        else System.out.println("YES");
    }
}
