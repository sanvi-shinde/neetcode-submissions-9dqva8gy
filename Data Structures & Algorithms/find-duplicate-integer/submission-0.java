class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>hashSet = new HashSet<Integer>();
        for(int i : nums){
            if(hashSet.contains(i)){
                return i;
            }
            hashSet.add(i);

        }
        
      return 0;  
    }
}
