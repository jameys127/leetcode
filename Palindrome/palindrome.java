package Palindrome;

class palindrome{
    public static boolean isPalindrome(int x){
        String answer = "";
        if(x < 0){
            return false;
        }
        String nums = Integer.toString(x);
        for (int i = nums.length() - 1; i >= 0; i--){
            answer = answer + nums.charAt(i);
        }
        System.out.println(nums);
        System.out.println(answer);
        if(answer.equals(nums)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        try {
            System.out.println(isPalindrome(127));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}