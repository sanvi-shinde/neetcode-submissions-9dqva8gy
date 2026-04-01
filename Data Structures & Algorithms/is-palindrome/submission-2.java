class Solution {
    public boolean isPalindrome(String s) {
        int start = 0 ;
        int end = s.length() - 1 ;
        s = s.toLowerCase();
        while(start < end){
            char charAtStart = s.charAt(start);
            char charAtEnd = s.charAt(end);
            if(!Character.isLetterOrDigit(charAtStart)){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(charAtEnd)){
                end--;
                continue;
            }
            if(charAtStart != charAtEnd){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
