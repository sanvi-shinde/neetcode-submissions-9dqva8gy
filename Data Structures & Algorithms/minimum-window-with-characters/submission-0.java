class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int[] tArr = new int[256];
        int[] sArr = new int[256];

        int minStart = 0;
        int minLen = Integer.MAX_VALUE;
        for(char ch : t.toCharArray()){
            tArr[ch]++;
        }
        int left = 0;
        for(int right = 0 ; right < s.length() ;right++){
            sArr[s.charAt(right)]++;
            while(contains(sArr , tArr)){
                if((right - left + 1) < minLen){
                    minLen = right - left + 1 ;
                    minStart = left;
                }
                sArr[s.charAt(left++)]--;
            }



        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart , minStart + minLen);
    }

    public boolean contains(int[] sArr , int[] tArr){
        for(int i = 0 ; i < 256 ; i++){
            if(tArr[i] > sArr[i]){
                return false;
            }
        }
        return true;
    }
}
