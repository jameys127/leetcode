package LongestCommonPrefix;

import java.util.Arrays;

public class Solution {
    public static String longestCommonPrefix(String[] strs){
        String answer = "";
        if(strs.length == 0){
            return answer;
        }
        Arrays.sort(strs);
        String x = strs[0];
        String y = strs[strs.length - 1];
        System.out.println(x);
        System.out.println(y);
        int index = 0;
        while(index < x.length() && index < y.length()){
            if(x.charAt(index) == y.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        for(int i = 0; i < index; i++){
            answer += x.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args){
        String[] input = {"main", "maine", "maining", "maingoal", "maingshit"};
        System.out.println("Array: " + input[0]);
        System.out.println(longestCommonPrefix(input));
    }
}
