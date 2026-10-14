class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : nums) {
            pq.offer(val);
        }
        while(--k > 0) {
            pq.poll();
        }
        return pq.peek();
    }
}