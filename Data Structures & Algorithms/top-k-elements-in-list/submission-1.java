class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] arr = new int[k];
        int index = 0;

        // Find top k frequent elements
        while (index < k) {

            int maxFreq = 0;
            int maxElement = 0;

            // Find element with highest frequency
            for (int key : map.keySet()) {

                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxElement = key;
                }
            }

            // Store in array
            arr[index] = maxElement;
            index++;

            // Remove already selected element
            map.remove(maxElement);
        }

        return arr;
    }
}
