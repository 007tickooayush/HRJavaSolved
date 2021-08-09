package String.Regex;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}


class MyRegex {
    String validOctet = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

    String pattern = validOctet + "\\." +
            validOctet + "\\." +
            validOctet + "\\." +
            validOctet;
}

// 21st problem