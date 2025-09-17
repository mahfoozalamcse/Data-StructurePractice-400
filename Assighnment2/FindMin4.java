package Assighnment2;

// leet code 185 : find min element sorteted and rotated array

public class FindMin4 {
    public static int findMin(int nums[]){
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                end--;
            }
        }

        return nums[start];
    }
    public static void main(String[] args) {
        
    }
}
