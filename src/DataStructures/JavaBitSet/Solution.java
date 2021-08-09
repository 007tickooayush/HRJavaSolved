package DataStructures.JavaBitSet;


import java.util.BitSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        BitSet[] set = new BitSet[3];

        set[1] = b1;
        set[2] = b2;

        while(m-- >0){
            String op = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();

            switch(op){
                case "AND":
                    set[x].and(set[y]);
                    break;
                case "OR":
                    set[x].or(set[y]);
                    break;
                case "XOR":
                    set[x].xor(set[y]);
                    break;
                case "FLIP":
                    set[x].flip(y);
                    break;
                case "SET":
                    set[x].set(y);
                    break;
                default:
                    break;
            }
            System.out.println(set[1].cardinality()+" "+set[2].cardinality());
        }
    }
}

// 12th onD
// 42nd problem