package assignment_04;

import java.util.Scanner;

public class TaskD {
    public static void printMatrix(int a, int b) {
        int cnt=0;
        for(int i=1;i<=a;i++){
            for(int k=1;k<=b;k++){
                cnt++;
                System.out.print(cnt+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        printMatrix(num1,num2);
    }
}
