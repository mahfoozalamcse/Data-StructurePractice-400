package Assighnment2;
// Leetcode 33. Search in Rotated Sorted Array

public class SerachSortedRoteted {
    // pivot based approch

    public static int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // right half exist pivot
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                // left half
                end = mid;
            }
        }

        return start;

    }

    // normal binary search
    public static int binarySearch(int nums[], int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        if (nums[pivot] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, pivot, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, pivot - 1, target);
        }
    }
    public static void main(String[] args) {
        
    }
}
