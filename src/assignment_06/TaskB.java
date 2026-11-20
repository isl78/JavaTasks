package assignment_06;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int cnt = 0;
        for (char x:word.toCharArray()){
            x = Character.toLowerCase(x);
            if (Character.isLetter(x) && (x!='a' && x!='o' && x!='e' && x!='i' && x!='u')) cnt++;
        }
        System.out.println("Consonants = "+cnt);
    }
}
