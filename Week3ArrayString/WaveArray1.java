package Week3ArrayString;
// Wave Array
/*


Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.

Input: arr[] = [2, 4, 7, 8, 9, 10]
Output: [4, 2, 8, 7, 10, 9]
Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.


 */

public class WaveArray1 {
    public static void waveform(int arr[]){
        int n = arr.length;

        if (n == 1) {
            return;
        }

        for(int i=0; i<n-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    // print array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print("  "+ arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        printArr(arr);
        waveform(arr);
        printArr(arr);
    }
}
