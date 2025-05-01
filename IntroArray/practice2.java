public class practice2 {
   
    // largest element value
    public static int largest(int arr[]){
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
      }
      return max;
    }

    // second largest
    public static int secLarge(int arr[]){
        int largest = largest(arr);
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (largest == arr[i]) {
                continue;
            }
            if (arr[i] > max && arr[i] <largest) {
                max = arr[i];
            }

        }
        return max;
    }

    // 
  public static void main(String[] args) {
    int arr[] = {12, 78, 90, 98, 77};
    // System.out.println();
    // System.out.println(largest(arr));


    System.out.println();
    System.out.println(secLarge(arr));
  }
}
