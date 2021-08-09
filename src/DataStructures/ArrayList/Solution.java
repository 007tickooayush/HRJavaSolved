package DataStructures.ArrayList;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PrintStream p = new PrintStream(System.out);

        List<List<Integer>> arrayList = new ArrayList<>();

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int d = s.nextInt();

            List<Integer> list = new ArrayList<>();

            while(d -- > 0){
                list.add(s.nextInt());
            }

            arrayList.add(i, list);

        }

        int q = s.nextInt();

        for (int i = 0; i < q; i++) {
            int x = s.nextInt() -1;
            int y = s.nextInt() -1;

            if (x <= arrayList.size() && y < arrayList.get(x).size() && y >= 0) {
                System.out.println(arrayList.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }

        s.close();
        p.close();
    }
}

// 5th onD
// 34th problem