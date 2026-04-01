class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < numbers.length; i++){
            int complement = target - numbers[i];
            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i + 1};
            }
            hashMap.put(numbers[i], i + 1);
        }
        return new int[]{};
    }
}
