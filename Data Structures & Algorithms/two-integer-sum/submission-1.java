class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> st=new HashMap<>();
     for(int i=0;i<nums.length;i++){
       int remaining_target=target-nums[i];
        if(st.containsKey(remaining_target)){
            return new int[]{st.get(remaining_target),i};
        }
        st.put(nums[i],i);
     }
     return new int[]{-1,-1};
        
    }
}
