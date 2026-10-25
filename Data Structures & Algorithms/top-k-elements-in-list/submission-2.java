class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Integer> listAns = new ArrayList<>();
        int minFreqInAns = Integer.MAX_VALUE; 
        int minFreqIndex = -1;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int currentKey = entry.getKey();
            int currentFreq = entry.getValue();
            
            if (listAns.size() < k) {
                listAns.add(currentKey);
                if (currentFreq < minFreqInAns) {
                    minFreqInAns = currentFreq;
                    minFreqIndex = listAns.size() - 1;
                }
            } 
            else {
                if (currentFreq <= minFreqInAns) {
                    continue; 
                }
                
                listAns.set(minFreqIndex, currentKey);
                
                minFreqInAns = freq.get(listAns.get(0));
                minFreqIndex = 0;
                for (int i = 1; i < listAns.size(); i++) {
                    int f = freq.get(listAns.get(i));
                    if (f < minFreqInAns) {
                        minFreqInAns = f;
                        minFreqIndex = i;
                    }
                }
            }
        }
        
        
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = listAns.get(i);
        }
        return ans;
    }
}

