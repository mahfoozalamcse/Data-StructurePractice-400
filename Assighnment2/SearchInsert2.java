package Assighnment2;

// Leet code 35 search insert position 
public class SearchInsert2 {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        System.out.println(" find and insert index : "+ searchInsert(arr, 7));
        System.out.println(" find and insert index : " + searchInsert(arr, 2));
        System.out.println(" find and insert index : " + searchInsert(arr, 5));

    }
}
