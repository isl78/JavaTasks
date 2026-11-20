package assignment_06;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word = word.trim().replaceAll("\\s+","_");
        System.out.println(word);
    }
}
