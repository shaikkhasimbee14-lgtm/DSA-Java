class Solution {
    public int jump(int[] nums) {
        int reach=0;
        int currentend=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            reach=Math.max(reach,i+nums[i]);
            if(i == currentend){
                count++;
                currentend=reach;
            }
        }
        return count;
    }
}
