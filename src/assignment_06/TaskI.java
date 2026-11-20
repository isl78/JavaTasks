package assignment_06;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        StringBuilder sb = new StringBuilder(word);
        for (int i=0;i<word.length()/2;i++){
            char tmp = word.charAt(i);
            char last = word.charAt(word.length()-1-i);
            sb.setCharAt(i,last);
            sb.setCharAt(word.length()-1-i,tmp);
        }
        String res = sb.toString();
        if (word.equals(res)==true) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
