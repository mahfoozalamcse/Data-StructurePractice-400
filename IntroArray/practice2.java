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

    // Reverse array
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // remove duplicate from sorted array
    public static int removeDuplicate(int arr[]){
        int res = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }

        }
        return res;
    }


    // remove last duplicate
    public int removeDuplicatesExceptLast(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[res++] = nums[i];
            }
        }

        // Always include the last element
        nums[res++] = nums[nums.length - 1];

        // If the last element was a duplicate of the element before it,
        // we need to potentially reduce the count.
        if (res > 1 && nums[res - 1] == nums[res - 2]) {
            // Check if there were more occurrences of this last element.
            // If so, we keep only one.
            int lastUniqueIndex = res - 2;
            while (lastUniqueIndex >= 0 && nums[lastUniqueIndex] == nums[res - 1]) {
                lastUniqueIndex--;
            }
            if (lastUniqueIndex < res - 2) {
                // Shift the last element to the correct unique position
                nums[lastUniqueIndex + 1] = nums[res - 1];
                res = lastUniqueIndex + 2;
            }
        }

        return res;
    }

    // print array
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
  public static void main(String[] args) {
    int arr[] = {78, 78, 90, 98, 99};
    // System.out.println();
    // System.out.println(largest(arr));


    // System.out.println(); 
    // System.out.print(secLarge(arr));

    // reverse(arr);
    // print(arr);
    System.out.println();
    System.out.println(removeDuplicate(arr));
    print(arr);
    
  }
}
