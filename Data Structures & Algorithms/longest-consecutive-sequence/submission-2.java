class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for(int num : nums){
            set.add(num);
        }

        for(int i : set){
            if(!set.contains(i - 1)){
                int num = i;
                int length = 1 ;
                while(set.contains(num+1)){
                    num = num + 1;
                    length = length + 1;
                }
                longest = Math.max(longest , length);
            }
        }
        return longest;
    }
}
