package DataStructures.JavaList;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> arrList = new ArrayList<>();

        while(n -- > 0){
            arrList.add(scan.nextInt());
        }

        int q = scan.nextInt();

        for(int i=0;i<q;i++){
            String action = scan.next();

            if(action.equals("Insert")){
                arrList.add(scan.nextInt(),scan.nextInt());
            }
            if(action.equals("Delete")){
                arrList.remove(scan.nextInt());
            }
        }

        for(int i:arrList){
            System.out.print(i+" ");
        }
        scan.close();
    }
}

// 6th onD
// 35th problem