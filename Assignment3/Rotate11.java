package Assignment3;

public  class Rotate11 {
    public void rotate(int arr[], int k) {
        // code here

        // Method 1: Using an extra array (O(n) space)
        // int[] rotated = new int[n];
        // for (int i = 0; i < n; i++) {
        // rotated[(i + k) % n] = nums[i];
        // }
        // System.arraycopy(rotated, 0, nums, 0, n);

        // Method 2: Repeatedly moving elements O(1) space, O(n*k) time - can be slow
        // for large k
        // for (int i = 0; i < k; i++) {
        // int temp = nums[n - 1];
        // for (int j = n - 1; j > 0; j--) {
        // nums[j] = nums[j - 1];
        // }
        // nums[0] = temp;
        // }

        int n = arr.length;
        k = k % n; // In case k is greater than n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        Rotate11 rotate11 = new Rotate11();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;

        rotate11.rotate(arr, k);

        // print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
