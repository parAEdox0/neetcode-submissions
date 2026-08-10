class Solution {
    public boolean hasDuplicate(int[] nums) {
        var hashSet = new HashSet<Integer>();
        for (int num : nums) {
            if(!hashSet.add(num)) {
                return true;
            }
        }
        return false;
    }
}