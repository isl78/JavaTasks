package assignment_04;

import java.util.Scanner;

public class TaskB {
    public static void printStrip(int num,char c){
        for (int i=1;i<=num;i++){
            System.out.print(c);
        }
        System.out.println();
    }
    public static void printHollowSquare(int a){
        printStrip(a,'*');
        for(int i=1;i<=a-2;i++){
            for (int k=1;k<=a;k++){
                if (k==1 || k==a) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        printStrip(a,'*');
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printHollowSquare(num);
    }
}
