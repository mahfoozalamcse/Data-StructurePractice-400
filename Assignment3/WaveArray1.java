package Assignment3;

public class WaveArray1 {
    public void sortInWave(int arr[]) {
        // code here
        if (arr.length == 1) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        for (int i = 0; i < n - 1; i += 2) {
            // swap arr[i] and arr[i+1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // print the wave array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
