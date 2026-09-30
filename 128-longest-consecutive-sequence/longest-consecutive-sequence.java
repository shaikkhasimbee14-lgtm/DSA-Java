class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxlength=0;
        for(int num:set){
            if(set.contains(num - 1)){
                continue;
            }else{
                int current=num;
                int length=1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                if(length>maxlength){
                    maxlength=length;
                }
            }
        }
        return maxlength;

    }
}