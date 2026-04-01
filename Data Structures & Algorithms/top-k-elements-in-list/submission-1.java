class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+ 1);
        }

        PriorityQueue<Integer>queue = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
         for(int num : map.keySet()){
            queue.add(num);
            if(queue.size() > k){
                queue.poll();

            }

         }

         int[] result = new int[k];
         for(int i = k - 1 ; i >=0 ; i--){
            result[i] = queue.poll();
         }
        return result;
    }
}
