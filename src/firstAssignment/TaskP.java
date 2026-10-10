package firstAssignment;

import java.util.Scanner;

public class TaskP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();
        int a2 = input.nextInt();
        int b2 = input.nextInt();
        int c2 = input.nextInt();
        int res = (a2*3600+b2*60+c2)-(a1*3600+b1*60+c1);
        System.out.println(res);
    }
}
