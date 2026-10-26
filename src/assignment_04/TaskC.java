package assignment_04;

import java.util.Scanner;

public class TaskC {
    public static void printInvertedPyramid(int a) {
        int finish = a * 2 - 1;
        for (int i = finish; i >= 1; i -= 2) {
            for (int k = i; k >= 1; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printInvertedPyramid(num);
    }
}
