class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int longest = 0;
        int left = 0;
        int maxFreq = 0;

        for(int right = 0 ; right < s.length(); right++){
            char ch = s.charAt(right);
            count[ch - 'A']++;
            maxFreq = Math.max(maxFreq , count[ch - 'A']);
            while((right - left + 1) - maxFreq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }

            longest = Math.max(longest , (right - left + 1));
        }
        return longest;
    }
}
