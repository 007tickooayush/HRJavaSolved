package DataStructures.JavaDequeue;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            set.add(num);

            if(deque.size() == m){
                if(set.size() > max)
                    max = set.size();
                int bottom = deque.remove();
                if(!deque.contains(bottom))
                    set.remove(bottom);
            }

        }

        System.out.println(max);
    }
}

// 11th onD
// 41st problem