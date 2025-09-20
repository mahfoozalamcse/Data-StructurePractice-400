package Assighnment2;
// gfg kth smallest find

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest9 {
    public static int minValue(int[] arr) {
        int i = 0;
        int minIdx = 0;
        int min = arr[i];

        for (i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIdx = i;
            }
        }
        arr[minIdx] = Integer.MAX_VALUE; // next not pic easily remove min
        return min;

    }

    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        // Arrays.sort(arr);
        // return arr[k-1];
        int ans = -1;
        for (int i = 0; i < k; i++) {

            int min = minValue(arr);
            if (k - 1 == i) {
                ans = min;
            }
        }

        return ans;

    }

  
    public static int kthSmallest3(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    private static int quickSelect(int[] arr, int left, int right, int k) {
        if (left <= right) {
            // Partition step
            int pivotIndex = partition(arr, left, right);

            if (pivotIndex == k) {
                return arr[pivotIndex]; // Found kth smallest
            } else if (pivotIndex > k) {
                return quickSelect(arr, left, pivotIndex - 1, k); // Search left
            } else {
                return quickSelect(arr, pivotIndex + 1, right, k); // Search right
            }
        }
        return -1; // Invalid case
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, right); // place pivot in correct position
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int kthSmallest4(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove largest
            }
        }

        return maxHeap.peek(); // kth smallest
    }
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 3;
        System.out.println(kthSmallest(arr, k)); // Output: 7
    }
}


