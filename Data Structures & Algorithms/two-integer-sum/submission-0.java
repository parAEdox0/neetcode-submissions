
class Solution {
    public int[] twoSum(int[] nums, int target) {
        var hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(hashMap.containsKey(compliment)) {
                return new int[] {hashMap.get(compliment), i};
            }
            hashMap.put(nums[i], i);
        }   
        return new int[] {};
    }
}
