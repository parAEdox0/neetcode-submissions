class Solution {
    public int[] getConcatenation(int[] nums) {
        int arrLength = nums.length;
        int[] ans = new int[2 * arrLength];
        for (int i = 0; i < arrLength; i++) {
            ans[i] = nums[i];
            ans[i + arrLength] = nums[i];
        }
        return ans;
    }
}