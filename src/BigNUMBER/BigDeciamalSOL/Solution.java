package BigNUMBER.BigDeciamalSOL;

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        for(int i=0;i<n;i++){
            BigDecimal b1 = new BigDecimal(s[i]);
            int idx = i;

            for(int j=i+1;j<n;j++){
                BigDecimal b2 = new BigDecimal(s[j]);

                if(b2.compareTo(b1) > 0){
                    b1 = b2;
                    idx = j;
                }
            }

            String temp = s[i];
            s[i] = s[idx];
            s[idx] = temp;
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}

// 6th onD
// 25th problem