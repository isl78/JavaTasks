package assignment_01;

import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(),hr,mn;
        hr = a/60%24;
        mn = a%60;
        System.out.println(hr + " " + mn);
    }
}
