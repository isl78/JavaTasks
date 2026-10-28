package assignment_04;

import java.util.Scanner;

public class TaskM {
    public static void printXpattern(int a) {
        int mid = a / 2 + 1;
        int cnt = 0;

        int start = 1;
        int end = a;
        for (int i = 1; i <= mid; i++) {
            for (int k = 1; k <= a; k++) {
                if (k == start || k == end) System.out.print("*");
                else System.out.print(" ");
            }
            start++;
            end--;
            System.out.println();
        }

        int newMid = a-mid;
        for (int j=newMid;j>=1;j--){
            for (int k = 1; k <= a; k++) {
                if (k == start || k == end) System.out.print("*");
                else System.out.print(" ");

            }
            start++;
            end--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printXpattern(num);
    }
}
