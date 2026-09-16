class Solution {
    public boolean canJump(int[] nums) {
        int fastreach=0;
        for(int i=0;i<nums.length;i++){
            if(i>fastreach){
                return false;
            }
            fastreach=Math.max(fastreach,i+nums[i]);
        }
        return true;
    }
}
