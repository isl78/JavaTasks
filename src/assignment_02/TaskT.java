package assignment_02;

import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double dis = b * b - 4 * a * c;
        if (dis > 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        } else if (dis == 0) {
            double x = -b / (2 * a) ;
            System.out.println(x);
        }
    }
}
