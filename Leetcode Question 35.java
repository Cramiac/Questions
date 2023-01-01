class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0, start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
                result = mid;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
                result = mid + 1;
            }
            else {
                result = mid;
                break;
            }
        }
        return result;
    }
}
