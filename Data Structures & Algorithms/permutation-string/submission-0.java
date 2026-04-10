class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Arr = new int[26];
        int[] window = new int[26];
        int left = 0;

        for(char ch : s1.toCharArray()){
            s1Arr[ch - 'a']++;
        }

        for(int right = 0 ; right < s2.length(); right++){
            window[s2.charAt(right) - 'a']++;

            if(right - left + 1 > s1.length()){
                window[s2.charAt(left) -'a']--;
                left++;
            }

            if(Arrays.equals(s1Arr , window)){
                return true;
            }
        }
        return false;
    }
}
