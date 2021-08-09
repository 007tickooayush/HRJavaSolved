package DataStructures.JavaStack;

import java.util.*;

class Solution {


    public static boolean isBalanced(String brackets) {
        char[] exp = brackets.toCharArray();
        Stack<Character> s = new Stack<>();
        for (char c : exp) {
            if (c == '{' || c == '[' || c == '(')
                s.push(c);

            if (s.empty())
                return false;

            char x;
            switch (c) {
                case '}':
                    x = s.peek();
                    s.pop();
                    if (x == '[' || x == '(')
                        return false;
                    break;
                case ']':
                    x = s.peek();
                    s.pop();
                    if (x == '{' || x == '(')
                        return false;
                    break;
                case ')':
                    x = s.peek();
                    s.pop();
                    if (x == '{' || x == '[')
                        return false;
                    break;
                default:
                    break;
            }
        }

        return s.empty();
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> st = new Stack<>();
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            boolean result = isBalanced(input);
            System.out.println(result);
        }

    }
}

// 11th onD
// 40th problem