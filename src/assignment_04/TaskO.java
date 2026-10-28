package assignment_04;

import java.util.Scanner;

public class TaskO {
    public static String isPalindrome(int a){
        int result = 0;
        int same = a;
        while (a!=0){
            int ost = a%10;
            result = result*10+ost;
            a/=10;
        }
        if (result==same) return "Palindrome";
        return "Not palindrome";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPalindrome(num));
    }
}
