class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long sum=0;
        long maxsum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size() == k){
        maxsum=sum;
        }
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            int count=map.get(nums[i-k]);
            if(count == 1){
                map.remove(nums[i-k]);
            }else{
                map.put(nums[i-k],count-1);
            }
            if(map.size() == k){
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
}