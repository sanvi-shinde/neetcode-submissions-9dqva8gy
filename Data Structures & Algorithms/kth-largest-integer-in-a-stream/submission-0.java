class KthLargest {
    private PriorityQueue<Integer> queue;
    int k ;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();
        for(int n : nums){
           add(n);
        }
    }
    
    public int add(int val) {
        queue.offer(val);
        if(queue.size() > k){
            queue.poll();
        }
        return queue.peek();
    }
}
