class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> vals = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        vals.put(nums[i],vals.getOrDefault(nums[i],0)+1);
       } 
       List<Integer>[] bucket = new List[nums.length+1];
       for(int key:vals.keySet()){
        int frequency = vals.get(key);
        if(bucket[frequency]==null){
          bucket[frequency]=new ArrayList<>();
        }
        bucket[frequency].add(key);

       }
       int[] ans = new int[k];
       int counter =0;
       for(int i=bucket.length-1;i>=0;i--){
        if(bucket[i]!=null){
          for(int num:bucket[i]){
            ans[counter++]=num;
            if(counter==k){
              return ans;
            }
          }
        }
       }
       return ans;
    }
}
