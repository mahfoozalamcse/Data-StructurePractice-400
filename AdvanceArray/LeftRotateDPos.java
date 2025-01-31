public class LeftRotateDPos {
    
    // left rotate by d posion array time O(N) space O(d)
    public static void leftRotateDPos1(int arr[], int d, int n){
        
        int temp[] = new int[n];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }
        for(int i=0; i<d; i++){
            arr[n-d+i] = temp[i];
        }

    }

    // print array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5};
      int d = 2;
      int n = 5;
      leftRotateDPos1(arr, d, n);
      printArray(arr);

    }
}