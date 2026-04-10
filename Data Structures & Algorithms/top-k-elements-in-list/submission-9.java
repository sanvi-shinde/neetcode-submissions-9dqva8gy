class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> frequency = new HashMap<>();

        for(int num : nums){
           frequency.put(num , frequency.getOrDefault(num , 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> frequency.get(a) - frequency.get(b));

        for(int i : frequency.keySet()){
            queue.add(i);
            if(queue.size() > k){
                queue.poll();
            }
        }
        
        int[] result = new int[k];
        for(int i = 0 ; i < k; i++){
            result[i] = queue.poll();
        }
        return result;
    }
}
