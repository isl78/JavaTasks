package assignment_06;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        for (int i=0;i<word.length();i++){
            char x = word.charAt(i);
            if (word.indexOf(x)==word.lastIndexOf(x)){
                System.out.println(x);
                break;
            }
        }
    }
}
