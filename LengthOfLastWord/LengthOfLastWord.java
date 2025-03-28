package LengthOfLastWord;

public class LengthOfLastWord {
    public static int Solution(String s){
        int skippedwhite = 0;
        if(s.length() == 1 && s.charAt(0) != ' '){
            return 1;
        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ' && skippedwhite == 0){
                continue;
            }
            skippedwhite = 1;
            if(i == 0 && s.charAt(i) != ' '){
                int counter = 1;
                int j = i + 1;
                while(j <= s.length() - 1 && s.charAt(j) != ' '){
                    j++;
                    counter++;
                }
                return counter;
            }
            if(s.charAt(i) == ' '){
                int counter = 0;
                int j = i + 1;
                while(j <= s.length() - 1 && s.charAt(j) != ' '){
                    j++;
                    counter++;
                }
                return counter;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        String a = "  fly me to the moon  ";
        String d = "stuff is cool";
        String f = "had";
        String p = "a ";
        System.out.println(s + " " + Solution(s));
        System.out.println(a + " " + Solution(a));
        System.out.println(d + " " + Solution(d));
        System.out.println(f + " " + Solution(f));
        System.out.println(p + " " + Solution(p));
    }
}
