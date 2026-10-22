package assignment_01;

import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt(),ost,res;
        ost = b*c/100;
        res = a*c+ost;
        System.out.println(res+" "+b*c%100);
    }
}
