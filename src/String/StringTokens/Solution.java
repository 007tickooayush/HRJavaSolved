package String.StringTokens;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintStream p = new PrintStream(System.out);

        String s = scan.nextLine().trim();
//        s = s.trim();
        if(s.length() != 0 && s.length()< 4*(Math.pow(10,5))){
            String[] words = s.split("[!,?.*_'@\\s]+");
            p.println(words.length);
            for(String word:words){
                p.println(word);
            }
        }

        scan.close();
        p.close();
    }
}

// solved 20 total
