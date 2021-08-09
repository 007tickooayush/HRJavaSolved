package String.Regex.TagContentExrtactor;


import java.util.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");

        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            int match = 0;
            Matcher m = pattern.matcher(line);
            while(m.find()){
                match++;
                System.out.println(m.group(2));

            }
            if(match == 0){
                System.out.println("None");
            }

            testCases--;
        }
    }
}
// 7th onD
// 26th problem


