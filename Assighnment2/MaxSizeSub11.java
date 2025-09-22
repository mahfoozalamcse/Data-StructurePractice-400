package Assighnment2;
// Maximum subarray size having all subarrays sums less than k
// int [] arr=[1,2,3,4],k=8
// Subarrays of size 1:[1],[2],[3],[4] sums=1,2,3,4≤8
// Subarrays of size 2:[1,2],[2,3],[3,4] sums=3,5,7≤8
// Subarrays of size 3:[1,2,3],[2,3,4] sums=6,9(9>8)
// Subarrays of size 4:[1,2,3,4]  sum=10
// Maximum valid size=2

public class MaxSizeSub11 {
    static int maxSubarraySize1(int[] arr, int k) {
        int n = arr.length;
        int ans = -1;

        for (int size = 1; size <= n; size++) {
            boolean valid = true;

            for (int i = 0; i + size <= n; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }
                if (sum > k) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                ans = size; // update max valid size
        }

        return ans;
    }

    // approach 2
    static boolean isValid(int[] arr, int k, int size) {
        int n = arr.length;
        int sum = 0;

        // first window
        for (int i = 0; i < size; i++)
            sum += arr[i];
        if (sum > k)
            return false;

        // sliding window
        for (int i = size; i < n; i++) {
            sum += arr[i] - arr[i - size];
            if (sum > k)
                return false;
        }

        return true;
    }

    static int maxSubarraySize2(int[] arr, int k) {
        int n = arr.length;
        int low = 1, high = n, ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isValid(arr, k, mid)) {
                ans = mid;
                low = mid + 1; // try bigger size
            } else {
                high = mid - 1; // try smaller size
            }
        }

        return ans;
    }

    // approach 3
    static int maxSubarraySize3(int[] arr, int k) {
        int n = arr.length;
        int ans = -1;

        // try all sizes from 1 to n
        for (int size = 1; size <= n; size++) {
            int sum = 0;

            // first window
            for (int i = 0; i < size; i++)
                sum += arr[i];
            if (sum > k)
                continue;

            boolean valid = true;
            for (int i = size; i < n; i++) {
                sum += arr[i] - arr[i - size];
                if (sum > k) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                ans = size;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int k = 8;
        System.out.println(maxSubarraySize1(arr, k)); // Output: 2
    }
}
