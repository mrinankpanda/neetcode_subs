class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        for (int i : stones) {
            pq.offer(i);
        }

        while (pq.size() > 1) {
            int v1 = pq.poll();
            int v2 = pq.poll();
            if (v1 != v2) {
                pq.offer(v1-v2);
            } else {
                pq.offer(0); 
            };
        }

        return pq.poll(); 

    }
}
