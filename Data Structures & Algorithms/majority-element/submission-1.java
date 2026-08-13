class Solution {
    public int majorityElement(int[] nums) {
        var hashMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            }
            else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }
        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) > (nums.length / 2)) {
                return key;
            }
        }
        return 0;
    }
}