class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int current = nums[i];
            int rightSum = totalSum - leftSum - current;
            int leftContribution = current * i - leftSum;
            int rightContribution =
                    rightSum - current * (n - i - 1);
            result[i] = leftContribution + rightContribution;
            leftSum += current;
        }
        return result;
    }
}