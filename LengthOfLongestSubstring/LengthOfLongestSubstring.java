package LengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        int longest = 0;
        int counter = 0;
        Map<Character, Integer> dummy = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            int j = i;
            // if(i == s.length() - 1 && longest > 0){
            //     break;
            // }
            while(j != s.length() && !(dummy.containsKey(s.charAt(j)))){
                counter++;
                dummy.put(s.charAt(j), j);
                if(counter > longest){
                    longest = counter;
                }
                j++;
            }
            dummy.clear();
            counter = 0;
        }
        return longest;
    }

    public static void main(String[] args) {
        String test1 = "abcabcabb";
        String test2 = "bbbbbb";
        String test3 = "pwwkew";
        String test4 = "aad";
        String test5 = "dvdfs";
        System.out.println("\n");
        System.out.println("Expected: 3 | Result: " + lengthOfLongestSubstring(test1));
        System.out.println("Expected: 1 | Result: " + lengthOfLongestSubstring(test2));
        System.out.println("Expected: 3 | Result: " + lengthOfLongestSubstring(test3));
        System.out.println("Expected: 2 | Result: " + lengthOfLongestSubstring(test4));
        System.out.println("Expected: 4 | Result: " + lengthOfLongestSubstring(test5));
    }
}
