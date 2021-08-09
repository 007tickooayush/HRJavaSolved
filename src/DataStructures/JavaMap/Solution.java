package DataStructures.JavaMap;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, BigInteger> map = new HashMap<>();

        int n = scan.nextInt();
        scan.nextLine();

        for(int i=0;i<n;i++){
            String name = scan.nextLine().trim();
            String number = scan.nextLine().trim();
            BigInteger num = new BigInteger(number);

            map.put(name,num);

        }

        while (scan.hasNext()){
            String s = scan.nextLine().trim();

            if(map.containsKey(s))
                System.out.println(s+"="+map.get(s));
            else
                System.out.println("Not found");
        }

        scan.close();
    }
}

// 10th onD
// 29th problem

