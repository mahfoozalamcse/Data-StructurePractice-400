package Assighnment2;

public class IterativeSearchRotated {
    public int search(int[] nums, int target) {
        
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // found
            }

            // Check if left half is sorted
            if (nums[start] <= nums[mid]) {
                // Target lies in left half?
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; // search left
                } else {
                    start = mid + 1; // search right
                }
            }
            // Otherwise right half is sorted
            else {
                // Target lies in right half?
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // search right
                } else {
                    end = mid - 1; // search left
                }
            }
        }

        return -1; // not found
    }
}
