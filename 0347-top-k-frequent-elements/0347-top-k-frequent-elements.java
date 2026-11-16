


class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Create Max-Heap using PriorityQueue
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) ->
                b.getValue() - a.getValue()
            );

        // Step 3: Insert all key-value pairs into PriorityQueue
        pq.addAll(map.entrySet());

        // Step 4: Extract top K frequent elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = pq.poll();

            result[i] = entry.getKey();
        }

        return result;
    }
}
