package Advanced.JavaMD5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

class MD5{
    static String getHex(byte[] bytes){
        StringBuilder hex = new StringBuilder();

        for(byte b: bytes){
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

        String str ;

        str = scan.next();

        MessageDigest md = MessageDigest.getInstance("MD5");

        md.update(str.getBytes(StandardCharsets.UTF_8));
        byte[] bytes = md.digest();

        print.println(MD5.getHex(bytes));

        scan.close();
        print.close();
    }
}


// 11th problem
// last problem