package Advanced.JavaSHA256;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

class SHA256{
    public static String getHex(byte[] bytes){
        StringBuilder hex = new StringBuilder();

        for(byte b:bytes){
            hex.append(String.format("%02x",b));
        }

        return hex.toString();
    }
}

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        PrintStream print = new PrintStream(System.out);
        String str = scan.next().trim();


        MessageDigest md = MessageDigest.getInstance("SHA-256");

        md.update(str.getBytes());

        byte[] digest= md.digest();

        print.print(SHA256.getHex(digest));

        print.close();
        scan.close();
    }
}

// 2nd onD
// 55th problem