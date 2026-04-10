class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int i = 0;
        int j = 0 ;
        int longest = 0;

        while(j < s.length()){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }

            set.add(s.charAt(j));
            longest = Math.max(longest , j - i + 1);
            j++;

        }
        return longest;
    }
}
