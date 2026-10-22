package assignment_04;

import java.util.Scanner;

public class TaskA {
    public static void printStrip(int num,char c){
        for (int i=1;i<=num;i++){
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printStrip(n,'#');
    }
}
