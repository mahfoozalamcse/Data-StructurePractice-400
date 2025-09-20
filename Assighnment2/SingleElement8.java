package Assighnment2;

public class SingleElement8 {
    public int singleNonDuplicate(int[] nums) {

        // naive approch 1
        // for (int i = 0; i < nums.length - 1; i += 2) {
        //     if (nums[i] != nums[i + 1]) {
        //         return nums[i];
        //     }
        // }

        // return nums[nums.length - 1];

        // approach 2

        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }

        return nums[start];

    }
}
