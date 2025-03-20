package IndexOfFirstOccurence;

public class IndexOfFirstOccurence {
    public static int strStr(String haystack, String needle){
        if(needle.length() > haystack.length()){
            return -1;
        }
        if(needle.equals(haystack)){
            return 0;
        }
        int index = 0;
        int referencePoint = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(index) && needle.length() == 1){
                return i;
            }
            if(haystack.charAt(i) == needle.charAt(index)){
                referencePoint = i;
                index++;
                int dummy = i;
                dummy++;
                System.out.println("it reached this point");
                for(int j = 0; j < needle.length(); j++){
                    if(j == needle.length() - 1 && haystack.charAt(dummy - 1) == needle.charAt(index - 1)){
                        return referencePoint;
                    }
                    if(dummy == haystack.length()){
                        index = 0; break;
                    }
                    if(haystack.charAt(dummy) == needle.charAt(index)){
                        dummy++;
                        index++;
                    }else{
                        index = 0;
                        break;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = 0;
        index = strStr("mississippi", "sippi");
        System.out.println(index);
    }
}
