package BigNUMBER.BigIntegerSOL;

import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintStream print = new PrintStream(System.out);

        String n = scan.nextLine();
        scan.close();
        BigInteger big = new BigInteger(n);

        if(big.isProbablePrime(1)){
            print.println("prime");
        }else
            print.println("not prime");

        print.close();
    }
}


//8th onD
//27th problem