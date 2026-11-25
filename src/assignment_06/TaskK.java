package assignment_06;

import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < sb.length(); i++) {
            char x = sb.charAt(i);
            if (x != ' ' && (i == 0 || word.charAt(i - 1) == ' ')) sb.setCharAt(i, Character.toUpperCase(x));
        }
        System.out.println(sb);
    }
}
