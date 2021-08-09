package ExceptionHandling.JavaTryCatch;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in  = new Scanner(System.in);

        try{
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(a/b);
        }catch (InputMismatchException ie){
            System.out.println(String.valueOf(ie.getClass()).split("\\s")[1]);
        }catch (ArithmeticException ae){
            System.out.println(String.valueOf(ae.getClass()).split("\\s")[1]+": "+ae.getLocalizedMessage());
        }

        in.close();
    }
}

// 9th onD
// 51st problem