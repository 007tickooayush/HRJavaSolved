package DataStructures.JavaArrayPart2;

import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap,int[] game){

        return isWon(leap,game,0);
    }

    public static boolean isWon(int leap,int arr[],int i){
        if(i < 0 || arr[i] == 1) return false;
        if((i == arr.length -1) || (i+leap > arr.length -1)) return true;

        arr[i] = 1;
        return isWon(leap,arr,i+1) || isWon(leap, arr, i-1) || isWon(leap, arr, i+leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

// 4th onD
// 33rd problem