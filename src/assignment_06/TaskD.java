package assignment_06;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int cnt = 0;
            for (int i=0;i<word.length();i++){
                char x = word.charAt(i);
                if (x!=' ' && (i==0 || word.charAt(i-1)==' ')) cnt++;
        }
        System.out.println("Words = "+cnt);
    }
}
