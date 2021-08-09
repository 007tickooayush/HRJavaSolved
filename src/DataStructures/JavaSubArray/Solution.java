package DataStructures.JavaSubArray;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static int negativeSum(List<Integer> list,int n){
        int count = 0;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=list.get(j);
                if(sum<0)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        List<Integer> list =  Arrays.stream(scan.nextLine().trim().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(negativeSum(list,n));

        scan.close();
    }
}

// 3rd onD
// 32nd problem