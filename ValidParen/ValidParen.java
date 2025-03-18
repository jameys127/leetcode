package ValidParen;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParen {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        System.out.println(map);
        if(s.isEmpty()){
            return true;
        }
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' 
            || s.charAt(i) == '{' 
            || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i) == ')' 
            || s.charAt(i) == '}' 
            || s.charAt(i) == ']'){
                if(stack.size() == 0){
                    return false;
                }
                if(stack.peek() == map.get(s.charAt(i))){
                    stack.pop();
                }else{
                    return false;
                }
            }

        }
        if(stack.size() == 0){
            return true;
        }
        return false;
        
    }

    public static void main(String[] args){
        System.out.println(isValid("())]{}"));
    }
}
