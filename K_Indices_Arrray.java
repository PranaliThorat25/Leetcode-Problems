class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
         List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) 
        {
            // Check if there exists any index j such that:
            // |i - j| <= k AND nums[j] == key
            for (int j = 0; j < n; j++) 
            {
                if (Math.abs(i - j) <= k && nums[j] == key) 
                {
                    result.add(i);
                    break;
                }
            }
        }
        return result;        
    }
}
